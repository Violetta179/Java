import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class laba2
{
    public static void main(String[] args)
    {

        //задание 1+
        Scanner in = new Scanner(System.in);
        System.out.print("Input N: ");
        int N = in.nextInt();

        System.out.print("Input X: ");
        double X = in.nextDouble();


        double rez =X;

        for(int i =1; i < N;i++)
        {
            rez += (2*i-1)*(Math.pow(X,2*i+1))/((2*i)*(2*i+1));
        }

        System.out.println("Result = " +rez);

        double y = Math.asin(X);
        System.out.println("arcsin = " +y);

        //Задание 2+
        System.out.println("VVedite cheslo1: ");
        int cheslo1 = in.nextInt();

        System.out.println("VVedite cheslo2: ");
        int cheslo2 = in.nextInt();

        while((cheslo1 != 0) && (cheslo2 != 0))
        {
            if (cheslo1 > cheslo2)
            {
                cheslo1 = cheslo1 % cheslo2;
            }
            else
            {
                cheslo2 = cheslo2 % cheslo1;
            }
        }

        System.out.println("result2 = " +(cheslo1+cheslo2));


    }
}
