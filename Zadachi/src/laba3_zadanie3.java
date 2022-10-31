import java.util.Scanner;
public class laba3_zadanie3
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input R: ");
        int R = in.nextInt();

        System.out.println("Input N: ");
        int N = in.nextInt();

        System.out.println("Input element in array: ");
        int[] array = new int[N];
        for(int i = 0; i < N; i++ )
        {
            System.out.print("Index: "+i+" = ");
            array [i] = in.nextInt();
        }

        int k = 0, k2 =1;
        int result1 = 0, result2=0;

        for(int  i = 0; i < N-1; i++)
        {
            for(int j = i+1; j < N; j++)
            {
                if(Math.abs(array[i]+array[j]-R) <Math.abs(array[k]+array[k2]-R))
                {
                    k = i;
                    k2 = j;

                }
            }
        }
        result1 = array[k];
        result2 = array[k2];

        System.out.println(" Index"+k+", Result= "+result1);
        System.out.println(" Index"+k2+", Result= "+result2);
    }
}
