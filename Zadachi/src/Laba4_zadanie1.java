import java.util.Scanner;
public class Laba4_zadanie1
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input rows of matrix: ");
        int N = in.nextInt();
        System.out.println("Input columns of matrix: ");
        int M = in.nextInt();
        System.out.println("Input array: ");
        int [][] array = new int[N][M];

        int min, max, imin = 0, imax = 0, tmp, jmin =0, jmax = 0;
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                array [i][j] = in.nextInt();
            }

        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        min = array[0][0];
        max = array[0][0];
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                if (array[i][j] < min)
                {
                    min = array[i][j];
                    imin = i;
                    jmin  = j;
                }
                if (array[i][j] > max)
                {
                    max = array[i][j];
                    imax = i;
                    jmax = j;
                }

            }
        }
        System.out.println("Min = "+min+" ,i="+imin+" ,j="+jmin);
        System.out.println("Max = "+max+" , i="+imax+" , j="+jmax);

        for(int j = 0; j < array.length+1; j++)
        {
            tmp = array[imin][j];
            array[imin][j] = array[imax][j];
            array[imax][j] = tmp;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
