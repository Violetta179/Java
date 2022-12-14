import java.io.*;
import java.net.*;

public class Server
{
    private ServerSocket serverSocket;
    public Server(ServerSocket serverSocket)
    {
        this.serverSocket = serverSocket;
    }
    public void startServer()
    {
        try
        {
            while (!serverSocket.isClosed())
            {
                Socket socket = serverSocket.accept();//ожидания подключения
                System.out.println("A new client has connected!");
                ClientHandler clientHandler = new ClientHandler(socket);//обработчик клиента

                Thread thread = new Thread(clientHandler);//создание потока для пользователя
                thread.start();
            }
        } catch (IOException e)//при потери соединения
        {

        }

    }
    public void closeServerSocket()
    {
        try{
            if(serverSocket != null)
            {
                serverSocket.close();
            }

        } catch (IOException e)

        {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) throws IOException
    {
        ServerSocket serverSocket = new ServerSocket(1234);
        Server server = new Server(serverSocket);
        server.startServer();
    }

}
