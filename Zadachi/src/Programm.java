import java.util.Scanner;
public class Programm {
    public static void main(String[] args) {

        double fi_nach = 0;
        double fi_p = 60.0;
        double fi_t = 270.0;
        double fi_conech = 360;

        double z = 1.5;
        double x = 2.1;

        double q = (Math.sin(z)+z*x)/(Math.pow(z, 2)+Math.pow(x,2));

        Scanner in = new Scanner(System.in);
        System.out.print("Input fi in gradusach: ");
        double fi = in.nextDouble();
        //System.out.println("fi in radianach: "+Math.toRadians(fi));

        if(fi_nach <=fi && fi < fi_p )
        {
            System.out.println("pervoe uslovie: w(fi)= "+q*Math.toRadians(fi));
        }
        else if (fi_p <= fi && fi_t >=fi)
        {
            System.out.println("vtoroe uslovie: w(fi)= : "+(1.5+q));
        }
        else if (fi_t < fi && fi<=fi_conech)
        {
            System.out.println("tretie uslovie: w(fi)= "+q*Math.pow(Math.toRadians(fi), 2));
        }

    }
}
