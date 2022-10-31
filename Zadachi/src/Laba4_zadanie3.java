import java.util.Arrays;
import java.util.Scanner;

public class Laba4_zadanie3
{
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input NxN matrix: ");
        int N = in.nextInt();

        int[][] array = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = in.nextInt();
            }

        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        int downKoeff = 0;
        int upKoeff = 0;
        int[][] diamass = new int[N*2][N-1];
        int k1=0; int k2 = 0;//индексы матрицы diamass
        int diaCount = 0;//кол-во диагоналей

        for(int i =0; i<N*2; i++)
            for (int j = 0; j < N-1; j++) diamass[i][j] = 999999999;

        while(downKoeff < N)
        {
            k2 = 0;
            for (int i = downKoeff+1,j=0; i < N && j < N-1; i++,j++)
            {
                diamass[k1][k2] = array[i][j];
                k2++;
            }
            downKoeff++;
            k1++;
            diaCount++;
        }
        k1--; diaCount--;
        System.out.println();
        while(upKoeff < N)
        {
            k2 = 0;
            for (int i = 0,j=upKoeff+1; i < N-1 && j<N; i++,j++)
            {
                diamass[k1][k2]=array[i][j];
                k2++;
            }
            upKoeff++;
            k1++;
            diaCount++;
        }
        diaCount--;
        System.out.print("DiagonalCount: "+diaCount+'\n');
        int min;
        for(int c = 1; c<=diaCount;c++)
        {   min=99999999;
            for(int n = 0;n<N-1;n++)
            {
                if(diamass[c-1][n]<min) min = diamass[c-1][n];
            }
            System.out.println("Minimal number in diagonal "+c+": "+min);
        }
    }
}
