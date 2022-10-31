import java.util.Scanner;
public class Zadanie2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input X: ");
        double x = in.nextDouble();

        System.out.print("Input Y: ");
        double y = in.nextDouble();

        if (  y>=0  && y<=1-x && y<=x+1)
        {
            System.out.println("nie Popadet");
        } else
        {
            System.out.println("Popadet");
        }
    }

}

