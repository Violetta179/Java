import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

//реакция, дата
public class ClientHandler implements Runnable//экземляры выполняться отдельным потоком
{
    public  static ArrayList<ClientHandler> clientHandlers = new ArrayList<>();//транслировать сообщения, взаимодействие между клиентами,
    private Socket socket;// устанавливает связь между клиентом и сервером
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String clientUsername;
    public ClientHandler(Socket socket)
    {
        try {
            this.socket = socket;
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));// устройство записи выходного потока, поток символов
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.clientUsername = bufferedReader.readLine();
            clientHandlers.add(this);// добавление клиента в массив
            broadcastMessage("SERVER: "+clientUsername+"has entered the chat!");
        }catch (IOException e)
        {
            closeEverything(socket, bufferedReader, bufferedWriter);//закроет поток
        }

    }
    @Override
    public void run()// прослушивание сообщений в отдельном потоке
    {
        String massageFromClient;
        while(socket.isConnected())
        {
            try{
                massageFromClient = bufferedReader.readLine();
                broadcastMessage(massageFromClient);

            } catch(IOException e)
            {
                closeEverything(socket, bufferedReader, bufferedWriter);
                break;//отключить только клиента
            }
        }

    }
    public void broadcastMessage(String messageToSend)//какое сообщение отправляет пользоваетль
    {
        for(ClientHandler clientHandler: clientHandlers)// пройтись по массиву . отправить всем сообщения
        {
            try
            {
                if(!clientHandler.clientUsername.equals(clientUsername))// не отпарвить пользователю который пищет сообщения
                {
                    clientHandler.bufferedWriter.write(messageToSend);
                    clientHandler.bufferedWriter.newLine();
                    clientHandler.bufferedWriter.flush();//очистить

                }
            } catch (IOException e)
            {
                closeEverything(socket, bufferedReader, bufferedWriter);
            }
        }

    }
    public void removeClientHandler()
    {
        clientHandlers.remove(this);
        broadcastMessage("Server: "+clientUsername+"has lest the chat!");
    }

    public void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter)
    {
        removeClientHandler();
        try{
            if(bufferedReader != null){
                bufferedReader.close();
            }
            if(bufferedWriter != null)
            {
                bufferedWriter.close();
            }
            if(socket != null)
            {
                socket.close();
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
