import java.util.Scanner;
public class laba2_zadanie2 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input N: ");
        double N = in.nextDouble();

        double maximum = 0;
        int nmax = 0;
        int iteration = 0 ;

        for( int i =1; i <= N; i++)
        {
            iteration ++;
            System.out.print("Input m: ");
            double m = in.nextDouble();

            System.out.print("Input v: ");
            double v = in.nextDouble();

            double p = m/v;
            System.out.println("№:"+iteration +" "+"P = " +p);
            if(p > maximum)
            {
                maximum = p;
                nmax = i;

            }

        }
        System.out.println("№: " + nmax+". "+"Result: "+maximum);

    }


}
