import java.util.Scanner;
public class zadanie4 {
    public static void main(String[] args)
    {
        int A = 0, B = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Input A: ");
        A = in.nextInt();

        System.out.print("Input B: ");
        B = in.nextInt();

        int iteration = 0;
        for( int i = B-1, j =A; j <i; i--)
        {
            iteration++;
            System.out.println("№"+iteration+" "+i);

        }
        System.out.println(iteration);

    }

}
