import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Laba3_zadanie1
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input row of : ");
        int N = in.nextInt();

        int sum = 0;
        System.out.println("Input K: ");
        int K = in.nextInt();

        System.out.println("Input L: ");
        int L = in.nextInt();

        System.out.println("Input array: ");
        int [] array = new int[N];

        for(int i = 0; i < N; ++i)
        {
            array [i] = in.nextInt();
        }

        for(int i =0; i < N; i++)
        {
            System.out.println("Index: "+ i+"array:" +array[i]);
        }
        for (int i=0; i<K; i++)
        {

            sum+=array[i];
        }
        System.out.println("Sum=  "+sum);
        for (int i=L+1; i<N; i++)
        {
            sum+=array[i];
        }
        System.out.println("Sum=  "+sum);
    }
}
