import java.util.Scanner;
public class Laba3_zadanie2
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Size of array: ");
        int N = in.nextInt();
        int[] a = new int[N];
        int max = 0;
        System.out.println("Input array: ");
        for(int i = 0; i < N; ++i)
        {
            a [i] = in.nextInt();
        }

        for (int i = 1; i < N - 1; i++)
        {
            if ((a[i - 1] > a[i]) && (a[i] < a[i + 1]))
            {
                if ((a[i] > max))
                {
                    max = a[i];
                }
            }

        }

        if ((a[0] < a[1]) && ((a[0] > max)))
        {
            max = a[0];

        }

        if ((a[N - 1] < a[N - 2]) && ((a[N - 1] > max))) {
            max = a[N - 1];

        }
        System.out.println("max = "+max);
    }

}
