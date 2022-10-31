import java.util.Scanner;//-
public class Zadanie3 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Input napravlenie: ");
        String S = in.nextLine();

        System.out.println("Input Cifrovuju comandu: ");
        int N = in. nextInt();

        switch(S)
        {
            case "S":
                switch(N)
                {
                    case 0: System.out.println("Sever");
                        break;
                    case 1: System.out.println("Zapad");
                        break;
                    case -1: System.out.println("Vostok");
                        break;
                }
                break;

            case "J":
                switch(N) {
                    case 0: System.out.println("Jug");
                        break;
                    case 1: System.out.println("Vostok");
                        break;
                    case -1: System.out.println("Zapad");
                        break;
                }
              break;
            case "V":
                switch(N) {
                    case 0: System.out.println("Vostok");
                        break;
                    case 1: System.out.println("Sever");
                        break;
                    case -1: System.out.println("Jug");
                        break;
                }
                break;

            case "Z":
                switch(N) {
                    case 0: System.out.println("Zapad");
                        break;
                    case 1: System.out.println("Jug");
                        break;
                    case -1: System.out.println("Sever");
                        break;
                }
                break;
        }

    }

}
