import java.util.Scanner;
public class laba5_1
{
    public static void main(String[] args)
    {
        Vegetables A = new Vegetables();
        A.set_Name();
        A.set_price();
        A.set_weight();
        A.set_type();
        A.get_information();

        System.out.println();

        carrot B = new carrot();
        B.set_Name();
        B.set_price();
        B.set_weight();
        B.setGrovePeriod_carrot();
        B.color_carrot();
        B.get_information_carrot();

        System.out.println();

        beet C = new beet();
        C.set_Name();
        C.set_price();
        C.set_weight();
        C.calloric_beet();
        C.location_beet();
        C.get_information_beet();

        System.out.println();

        onion D = new onion();
        D.set_Name();
        D.set_price();
        D.set_weight();
        D.size_onion();
        D.freshness_level();
        D.get_information_onion();

    }
}

class Vegetables
{
    Scanner in = new Scanner(System.in);
    int count_vegetable;
    String name[] = new String[200];
    int price[] = new int[200];
    double weight[] = new double[200];
    String type_vegetables[] = new String[200];
    public void set_Count()
    {
        System.out.println("Enter number of vegetables: ");
        count_vegetable = in.nextInt();
    }
    public void set_Name()
    {
        set_Count();
        for(int i = 0; i< count_vegetable; i++)
        {
            System.out.println("Enter name: ");
            name[i] = in.next();
        }
    }

    public void set_weight()
    {
        for (int i = 0; i < count_vegetable; i++)
        {
            System.out.println("Enter weight: ");
            weight[i] = in.nextDouble();
        }
    }
    public void set_price()
    {
        for(int i = 0; i< count_vegetable;i++)
        {
            System.out.println("Enter price: ");
            price[i] = in.nextInt();
        }
    }
    public final void  set_type()
    {
        for(int i = 0; i<count_vegetable; i++)
        {
            System.out.println("Enter type of vegetables: ");
            type_vegetables[i] = in.next();
        }
    }

    public void get_information(){
        for(int i = 0; i <count_vegetable; i++)
        {
           System.out.println(name[i]+" "+weight[i]+" "+price[i]+" "+type_vegetables[i]);
            //System.out.println(name[i]+"|" +"\t"+price[i]+"|"+"\t"+weight[i]+"|"+"\t"+type_vegetables[i]);
        }
    }

}

class carrot extends Vegetables
{
    int count_carrot;
    int price_carrot[] = new int[200];
    double weight_carrot[] = new double[200];

    double groveperiod_carrot[] = new double[200];
    String color_carrott[] = new String[200];
    String name_carrot[] = new String[200];
    public void set_Count()
    {
        System.out.println("Enter count of Carrot: ");
        count_carrot = in.nextInt();
    }

    @Override
    public void set_Name()
    {
        set_Count();
        for(int i =0; i <count_carrot; i++)
        {
            System.out.println("Enter name carrot: ");
            name_carrot[i] = in.next();
        }

    }

    @Override
    public void set_weight()
    {
        for(int i =0; i <count_carrot; i++)
        {
            System.out.println("Enter weight of carrot: ");
            weight_carrot[i] = in.nextDouble();
        }
    }

    public void set_price()
    {
        for(int i =0; i <count_carrot; i++)
        {
            System.out.println("Enter price carrot: ");
            price_carrot[i] = in.nextInt();
        }
    }

    public void setGrovePeriod_carrot()
    {
        for(int i =0; i <count_carrot; i++)
        {
            System.out.println("Enter period grove for carrot: ");
            groveperiod_carrot[i] = in.nextDouble();
        }
    }
    public void color_carrot()
    {
        for(int i =0; i <count_carrot; i++)
        {
            System.out.println("Enter color of carrot: ");
           color_carrott[i] = in.next();
        }
    }

    public void get_information_carrot()
    {
        for(int i = 0; i < count_carrot; i++)
        {
            System.out.println(name_carrot[i]+" "+weight_carrot[i]+" "+ price_carrot[i]+" "+groveperiod_carrot[i]+" "+color_carrott[i] );
        }

    }
}

class beet extends Vegetables
{
    int count_beet;
    int price_beet[] = new int[200];
    double weight_beet[] = new double[200];

    double callori_beets[] = new double[200];
    String locacia_beet[] = new String[200];
    String name_beet[] = new String[200];
    public void set_Count()
    {
        System.out.println("Enter count of Beet: ");
        count_beet = in.nextInt();
    }

    @Override
    public void set_Name()
    {
        set_Count();
        for(int i =0; i <count_beet; i++)
        {
            System.out.println("Enter name Beet: ");
            name_beet[i] = in.next();
        }

    }

    @Override
    public void set_weight()
    {
        for(int i =0; i <count_beet; i++)
        {
            System.out.println("Enter weight of beet: ");
            weight_beet[i] = in.nextDouble();
        }
    }

    public void set_price()
    {
        for(int i =0; i <count_beet; i++)
        {
            System.out.println("Enter price beet: ");
            price_beet[i] = in.nextInt();
        }
    }

    public void calloric_beet()
    {
        System.out.println("Calloric in zavisimosti for weight(43 calorij on 100g: ");
        for(int i =0; i <count_beet; i++)
        {
            callori_beets[i] = 0.43*weight_beet[i];
            System.out.println(callori_beets[i]);

        }
    }

    public void location_beet()
    {
        for(int i =0; i <count_beet; i++)
        {
            System.out.println("Enter location beet: ");
            locacia_beet[i] = in.next();
        }
    }

    public void get_information_beet()
    {
        for(int i = 0; i < count_beet; i++)
        {
            System.out.println(name_beet[i]+" "+weight_beet[i]+" "+ price_beet[i]+" "+callori_beets[i]+" "+locacia_beet[i]);
        }

    }

}

class onion extends Vegetables
{
    int count_onion;
    int price_onion[] = new int[200];
    double weight_onion[] = new double[200];
    double sizic_onion[] = new double[200];
    double level_onion[] = new double[200];
    String name_onion[] = new String[200];
    public void set_Count()
    {
        System.out.println("Enter count of Onion: ");
        count_onion = in.nextInt();
    }

    @Override
    public void set_Name()
    {
        set_Count();
        for(int i =0; i <count_onion; i++)
        {
            System.out.println("Enter name onion: ");
            name_onion[i] = in.next();
        }

    }

    @Override
    public void set_weight()
    {
        for(int i =0; i <count_onion; i++)
        {
            System.out.println("Enter weight of onion: ");
            weight_onion[i] = in.nextDouble();
        }
    }

    public void set_price()
    {
        for(int i =0; i <count_onion; i++)
        {
            System.out.println("Enter price onion: ");
            price_onion[i] = in.nextInt();
        }
    }
    public void size_onion()
    {
        for(int i =0; i <count_onion; i++)
        {
            System.out.println("Enter size onion: ");
            sizic_onion[i] = in.nextDouble();
        }

    }

    public void freshness_level()
    {
        for(int i =0; i <count_onion; i++)
        {
            System.out.println("Enter freshness level onion: ");
            level_onion[i] = in.nextDouble();
        }
    }
    public void get_information_onion()
    {
        for(int i = 0; i < count_onion; i++)
        {
            System.out.println(name_onion[i]+" "+weight_onion[i]+" "+ price_onion[i]+" "+sizic_onion[i]+" "+level_onion[i]);
        }

    }
}