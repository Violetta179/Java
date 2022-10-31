import java.util.Scanner;

public class laba4_zadanie2 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input rows of matrix: ");
        int N = in.nextInt();
        System.out.println("Input columns of matrix: ");
        int M = in.nextInt();
        System.out.println("Input array: ");
        int[][] array = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = in.nextInt();
            }

        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        int n_col = M;
        int[][] b = new int[N][M+1];
        for (int j = 0; j < M && n_col == M; j++) {
            for (int i = 0; i < N; i++)
            {
                if (array[i][j] < 0) break;
                else if (i == (N - 1)) n_col = j;
            }
        }


        if (n_col != M)
        {
            System.out.println();
            for (int i = 0, ia = 0; i < N; ++i, ++ia)
            {
                for (int j = 0, ja = 0; j < M + 1; ++j, ++ja)
                {
                    if (j == n_col)
                    {
                        b[i][j] = 1;
                        --ja;
                    }
                    else
                        b[i][j] = array[ia][ja];
                }
            }

            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < M+1; j++)
                {
                    System.out.print(b[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        else if(n_col == M)
        {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
        }


    }


}