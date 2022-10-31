import java.sql.*;
import java.util.Scanner;

public class laba6sql
{
    public static void main(String[] args)
    {

        Vegetables A = new Vegetables();
        A.CreateTable_Vegetables();
        A.set_Name();
        A.delete_prices();
        A.edit_vegetables();
        A.get_information();
        System.out.println();

        carrot B = new carrot();
        B.CreateTable_Carrot();
        B.set_Name();
        B.delete_prices_carrot();
        B.edit_weight_carrot();
        B.get_information_carrot();

        System.out.println();

        beet C = new beet();
        C.CreateTable_Beet();
        C.set_Name();
        C.delete_callori_beet();
        C.edit_price_beet();
        C.get_information_beet();

        System.out.println();

        onion D = new onion();
        D.CreateTable_Onion();
        D.set_Name();
        D.delete_level_onion();
        D.edit_size_onion();
        D.get_information_onion();

    }

    public static void Connection()
    {
        try{
            String url = "jdbc:mysql://localhost/vegetables";
            String username = "root";
            String password = "adminviolka@1234";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                System.out.println("Connection to Store DB succesfull!");
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
    }


class Vegetables
{
    Scanner in = new Scanner(System.in);
    int count_vegetable;
    String name;
    int price;
    double weight;
    String type_vegetables;

    public void CreateTable_Vegetables()
    {
        try{
            String url = "jdbc:mysql://localhost/vegetables";
            String username = "root";
            String password = "adminviolka@1234";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            String sqlCommand = "CREATE TABLE Vegetabless (Id INT PRIMARY KEY AUTO_INCREMENT, NameVegetable VARCHAR(20), Price INT, Weight INT, TypeVegetables VARCHAR(20))";
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                Statement statement = conn.createStatement();
                statement.executeUpdate(sqlCommand);
                System.out.println("Database has been created!");
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }

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
            name = in.next();
            System.out.println("Enter price: ");
            price = in.nextInt();
            System.out.println("Enter weight: ");
            weight = in.nextDouble();
            System.out.println("Enter type of vegetables: ");
            type_vegetables = in.next();
            try{
                String url = "jdbc:mysql://localhost/vegetables";
                String username = "root";
                String password = "adminviolka@1234";
                Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
                try (Connection conn = DriverManager.getConnection(url, username, password)){
                    Statement statement = conn.createStatement();
                    int rows = statement.executeUpdate("INSERT Vegetabless(NameVegetable, Price, Weight, TypeVegetables)"+ "VALUES"+"('"+name+"',"+price+","+weight+","+"'"+type_vegetables+"')");
                }
            }
            catch(Exception ex){
                System.out.println("Connection failed...");

                System.out.println(ex);
            }

        }
    }

    public void delete_prices()
    {
        String znak;
        System.out.println("Enter znak: ");
        znak = in.next();
        int delete_prices;
        System.out.println("Enter delete for price: ");
        delete_prices = in.nextInt();
        try{
            String url = "jdbc:mysql://localhost/vegetables";
            String username = "root";
            String password = "adminviolka@1234";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                Statement statement = conn.createStatement();
                int rows = statement.executeUpdate("DELETE FROM Vegetabless WHERE Price"+(znak)+(delete_prices));
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }

    public void edit_vegetables()
    {
        try{
            String url = "jdbc:mysql://localhost/vegetables";
            String username = "root";
            String password = "adminviolka@1234";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                Statement statement = conn.createStatement();
                int rows = statement.executeUpdate("UPDATE Vegetabless SET Price = Price + 5000");
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }

    }
    public void get_information(){
        try{
            String url = "jdbc:mysql://localhost/vegetables";
            String username = "root";
            String password = "adminviolka@1234";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            try (Connection conn = DriverManager.getConnection(url, username, password)){
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM Vegetabless");
                while(resultSet.next()){

                    int id = resultSet.getInt(1);
                    String names = resultSet.getString(2);
                    int prices = resultSet.getInt(3);
                    int weights = resultSet.getInt(4);
                    String types = resultSet.getString(5);
                    System.out.printf("%d. %s - %d - %d - %s \n", id, names, prices, weights, types);
                }
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
    }

class carrot extends Vegetables
{
    int count_carrot;
    int price_carrot;
    double weight_carrot;
    String color_carrot;
    String name_carrot;

    public void CreateTable_Carrot()
    {
        try{
            String url = "jdbc:mysql://localhost/vegetables";
            String username = "root";
            String password = "adminviolka@1234";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            String sqlCommand = "CREATE TABLE Carrot (Id INT PRIMARY KEY AUTO_INCREMENT, NameCarrot VARCHAR(20), PriceCarrot INT, WeightCarrot INT, ColorCarrot VARCHAR(20))";
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                Statement statement = conn.createStatement();
                statement.executeUpdate(sqlCommand);
                System.out.println("Database has been created!");
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
    public void set_Count()
    {
        System.out.println("Enter count of Carrot: ");
        count_carrot = in.nextInt();
    }
    public void set_Name()
    {
        set_Count();
        for(int i = 0; i< count_carrot; i++)
        {
            System.out.println("Enter name: ");
            name_carrot = in.next();
            System.out.println("Enter price: ");
            price_carrot = in.nextInt();
            System.out.println("Enter weight: ");
            weight_carrot = in.nextDouble();
            System.out.println("Enter color of carrot: ");
            color_carrot = in.next();
            try{
                String url = "jdbc:mysql://localhost/vegetables";
                String username = "root";
                String password = "adminviolka@1234";
                Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
                try (Connection conn = DriverManager.getConnection(url, username, password)){
                    Statement statement = conn.createStatement();
                    int rows = statement.executeUpdate("INSERT Carrot(NameCarrot, PriceCarrot, WeightCarrot, ColorCarrot)"+ "VALUES"+"('"+name_carrot+"',"+price_carrot+","+weight_carrot+","+"'"+color_carrot+"')");
                }
            }
            catch(Exception ex){
                System.out.println("Connection failed...");
                System.out.println(ex);
            }

        }

    }

    public void delete_prices_carrot()
    {
        String znak;
        System.out.println("Enter znak: ");
        znak = in.next();
        int delete_prices;
        System.out.println("Enter delete for price: ");
        delete_prices = in.nextInt();
        try{
            String url = "jdbc:mysql://localhost/vegetables";
            String username = "root";
            String password = "adminviolka@1234";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                Statement statement = conn.createStatement();
                int rows = statement.executeUpdate("DELETE FROM Carrot WHERE PriceCarrot"+(znak)+(delete_prices));
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }

    public void edit_weight_carrot()
    {
        try{
            String url = "jdbc:mysql://localhost/vegetables";
            String username = "root";
            String password = "adminviolka@1234";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                Statement statement = conn.createStatement();
                int rows = statement.executeUpdate("UPDATE Carrot SET WeightCarrot = WeightCarrot + 50");
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }

    public void get_information_carrot()
    {
        try{
            String url = "jdbc:mysql://localhost/vegetables";
            String username = "root";
            String password = "adminviolka@1234";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            try (Connection conn = DriverManager.getConnection(url, username, password)){
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM Carrot");
                while(resultSet.next()){

                    int id = resultSet.getInt(1);
                    String names_carrot = resultSet.getString(2);
                    int prices_carrot = resultSet.getInt(3);
                    int weights_carrot = resultSet.getInt(4);
                    String color_carrot = resultSet.getString(5);
                    System.out.printf("%d. %s - %d - %d - %s \n", id, names_carrot, prices_carrot, weights_carrot, color_carrot);
                }
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
}

class beet extends Vegetables
{
    int count_beet;
    int price_beet ;
    double weight_beet;
    double callori_beets;
    String locacia_beet;
    String name_beet;

    public void CreateTable_Beet()
    {
        try{
            String url = "jdbc:mysql://localhost/vegetables";
            String username = "root";
            String password = "adminviolka@1234";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            String sqlCommand = "CREATE TABLE Beet (Id INT PRIMARY KEY AUTO_INCREMENT, NameBeet VARCHAR(20), PriceBeet INT, WeightBeet INT, CalloriBeet INT, LocationBeet VARCHAR(20))";
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                Statement statement = conn.createStatement();
                statement.executeUpdate(sqlCommand);
                System.out.println("Database has been created!");
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
    public void set_Count()
    {
        System.out.println("Enter count of Beet: ");
        count_beet = in.nextInt();
    }

    @Override
    public void set_Name()
    {
        set_Count();
        for(int i = 0; i< count_beet; i++)
        {
            System.out.println("Enter name: ");
            name_beet = in.next();
            System.out.println("Enter price: ");
            price_beet = in.nextInt();
            System.out.println("Enter weight: ");
            weight_beet = in.nextDouble();
            System.out.println("Enter colorii: ");
            callori_beets = in.nextDouble();
            System.out.println("Enter location of carrot: ");
            locacia_beet = in.next();
            try{
                String url = "jdbc:mysql://localhost/vegetables";
                String username = "root";
                String password = "adminviolka@1234";
                Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
                try (Connection conn = DriverManager.getConnection(url, username, password)){
                    Statement statement = conn.createStatement();
                    int rows = statement.executeUpdate("INSERT Beet(NameBeet, PriceBeet, WeightBeet, CalloriBeet, LocationBeet)"+ "VALUES"+"('"+name_beet+"',"+price_beet+","+weight_beet+","+callori_beets+",'"+locacia_beet+"')");
                }
            }
            catch(Exception ex){
                System.out.println("Connection failed...");
                System.out.println(ex);
            }

        }
    }

    public void delete_callori_beet()
    {
        String znak;
        System.out.println("Enter znak: ");
        znak = in.next();
        int delete_callori;
        System.out.println("Enter delete for callori: ");
        delete_callori = in.nextInt();
        try{
            String url = "jdbc:mysql://localhost/vegetables";
            String username = "root";
            String password = "adminviolka@1234";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                Statement statement = conn.createStatement();
                int rows = statement.executeUpdate("DELETE FROM Beet WHERE CalloriBeet"+(znak)+(delete_callori));
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }

    public void edit_price_beet()
    {
        try{
            String url = "jdbc:mysql://localhost/vegetables";
            String username = "root";
            String password = "adminviolka@1234";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                Statement statement = conn.createStatement();
                int rows = statement.executeUpdate("UPDATE Beet SET PriceBeet = PriceBeet + 100");
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
    public void get_information_beet()
    {
        try{
            String url = "jdbc:mysql://localhost/vegetables";
            String username = "root";
            String password = "adminviolka@1234";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            try (Connection conn = DriverManager.getConnection(url, username, password)){
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM Beet");
                while(resultSet.next()){

                    int id = resultSet.getInt(1);
                    String names_beet = resultSet.getString(2);
                    int prices_beet = resultSet.getInt(3);
                    int weights_beet = resultSet.getInt(4);
                    int colorii_beet = resultSet.getInt(5);
                    String location_beet= resultSet.getString(6);
                    System.out.printf("%d. %s - %d - %d - %d - %s \n", id, names_beet, prices_beet, weights_beet, colorii_beet, location_beet);
                }
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }

    }



}

class onion extends Vegetables
{
    int count_onion;
    int price_onion;
    double weight_onion;
    double sizic_onion;
    double level_onion;
    String name_onion;
    public void set_Count()
    {
        System.out.println("Enter count of Onion: ");
        count_onion = in.nextInt();
    }

    public void CreateTable_Onion()
    {
        try{
            String url = "jdbc:mysql://localhost/vegetables";
            String username = "root";
            String password = "adminviolka@1234";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            String sqlCommand = "CREATE TABLE Onion(Id INT PRIMARY KEY AUTO_INCREMENT, NameOnion VARCHAR(20), PriceOnion INT, WeightOnion INT, SizeOnion INT, LevelOnion INT)";
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                Statement statement = conn.createStatement();
                statement.executeUpdate(sqlCommand);
                System.out.println("Database has been created!");
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
    @Override
    public void set_Name() {
        set_Count();
        for(int i = 0; i< count_onion; i++)
        {
            System.out.println("Enter name: ");
            name_onion = in.next();
            System.out.println("Enter price: ");
            price_onion = in.nextInt();
            System.out.println("Enter weight: ");
            weight_onion = in.nextDouble();
            System.out.println("Enter size: ");
            sizic_onion = in.nextDouble();
            System.out.println("Enter level freshnes: ");
            level_onion = in.nextDouble();
            try{
                String url = "jdbc:mysql://localhost/vegetables";
                String username = "root";
                String password = "adminviolka@1234";
                Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
                try (Connection conn = DriverManager.getConnection(url, username, password)){
                    Statement statement = conn.createStatement();
                    int rows = statement.executeUpdate("INSERT Onion(NameOnion, PriceOnion, WeightOnion, SizeOnion, LevelOnion)"+ "VALUES"+"('"+name_onion+"',"+price_onion+","+weight_onion+","+sizic_onion+","+level_onion+")");
                }
            }
            catch(Exception ex){
                System.out.println("Connection failed...");
                System.out.println(ex);
            }

        }
    }

    public void delete_level_onion()
    {
        String znak;
        System.out.println("Enter znak: ");
        znak = in.next();
        int delete_level;
        System.out.println("Enter delete for callori: ");
        delete_level = in.nextInt();
        try{
            String url = "jdbc:mysql://localhost/vegetables";
            String username = "root";
            String password = "adminviolka@1234";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                Statement statement = conn.createStatement();
                int rows = statement.executeUpdate("DELETE FROM Onion WHERE LevelOnion"+(znak)+(delete_level));
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }

    public void edit_size_onion()
    {
        try{
            String url = "jdbc:mysql://localhost/vegetables";
            String username = "root";
            String password = "adminviolka@1234";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                Statement statement = conn.createStatement();
                int rows = statement.executeUpdate("UPDATE Onion SET SizeOnion = SizeOnion + 10");
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
    public void get_information_onion()
    {
        try{
            String url = "jdbc:mysql://localhost/vegetables";
            String username = "root";
            String password = "adminviolka@1234";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            try (Connection conn = DriverManager.getConnection(url, username, password)){
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM Onion");
                while(resultSet.next()){

                    int id = resultSet.getInt(1);
                    String names_onion = resultSet.getString(2);
                    int prices_onion = resultSet.getInt(3);
                    int weights_onion = resultSet.getInt(4);
                    int sizess_onion = resultSet.getInt(5);
                    int lev_onion= resultSet.getInt(6);
                    System.out.printf("%d. %s - %d - %d - %d - %d \n", id, names_onion, prices_onion, weights_onion, sizess_onion, lev_onion);
                }
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
}
