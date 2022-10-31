import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args)
    {
        int sum = 0;
        double prod = 1;
        int j = 47;
        do
        {
            if (j % 11 == 0)
            {
                sum = sum + j;
                prod = prod * j;
            }
            j++;

        } while(j <= 100);
        System.out.println(sum);
        System.out.println(prod);

    }

}
