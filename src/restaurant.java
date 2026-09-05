import java.util.Scanner;

class fd //same file
{
    String foodName;
    String drinkName;

    fd () {}
    fd (String foodName, String drinkName)
    {
        this.foodName = foodName;
        this.drinkName = drinkName;
    }
}


public class restaurant
{
    // states
    float foodPrice;
    double drinkPrice;
    String cashierName;
    String paymentType;
    String foodName;
    String drinkName;
    int dailyDiscount;
    boolean isDiscountable;
    int noofFood;
    int noofDrink;
    fd foodDrink;
    market m;

    // methods
    // default constructor
    public restaurant ()
    {}

    // test (what you have, cannot hardcode everything)
    public restaurant (String cashierName, String paymentType)
    {
        this.cashierName = cashierName;
        this.paymentType = paymentType;
    }
    public restaurant (float foodPrice)
    {
        this.foodPrice = foodPrice;
    }

    public restaurant (float foodPrice, double drinkPrice)
    {
        this.foodPrice = foodPrice;
        this.drinkPrice = drinkPrice;
    }
    public restaurant (float foodPrice, double drinkPrice, String cashierName)
    {
        this.foodPrice = foodPrice;
        this.drinkPrice = drinkPrice;
        this.cashierName = cashierName;
    }

    /*public restaurant (String foodName, String drinkName)
    {
        this.foodName = foodName;
        this.drinkName = drinkName;
    }*/

    public restaurant (int dailyDiscount, boolean isDiscountable)
    {
        this.dailyDiscount = dailyDiscount;
        this.isDiscountable = isDiscountable;
        System.out.println("Discount can be applied for this restaurant.");
    }

    double rawtotalCost(int noofFood, int noofDrink)
    {
        return noofDrink * drinkPrice + noofFood * foodPrice;
    }

    void displayReceipt(String foodName, String drinkName, int foodPrice, double drinkPrice, String cashierName)
    {
        System.out.println("\n");
        System.out.println("-----RECEIPT------");
        System.out.println("Food: " + foodName + " - $" + foodPrice);
        System.out.println("Drink: " + drinkName + " - $" + drinkPrice);
        System.out.print("Served by: "+cashierName+"\n");
    }


    public static void main(String[] args)
    {
        restaurant r1 = new restaurant();
        restaurant r2 = new restaurant(12.5f);
        restaurant r3 = new restaurant(12.5f, 3.0);
        restaurant r4 = new restaurant(12.5f, 3.0, "Maria");
        restaurant r5 = new restaurant("Lisa", "Visa");
        restaurant r6 = new restaurant(15, true);
        fd fd1 = new fd("burger","cola");
        r1.foodDrink = fd1;

        r6.m = new market("ABC market");
        System.out.println(r6.m.marketName+" "+r6.dailyDiscount);

        System.out.println(r1.foodDrink.foodName); //access

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name of food: ");
        r1.foodName= sc.nextLine();

        System.out.print("Enter cost of food: ");
        r1.foodPrice = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter qty of food: ");
        r1.noofFood = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name of drink: ");
        r1.drinkName= sc.nextLine();

        System.out.print("Enter cost of drink: ");
        r1.drinkPrice = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter qty of drink: ");
        r1.noofDrink = sc.nextInt();
        sc.nextLine();

        System.out.print("Is the purchase discountable?: (true/false) ");
        r1.isDiscountable = sc.nextBoolean();

        if (r1.isDiscountable)
        {
            System.out.print("Enter discount rate (%) for the day: ");
            int discountRate = sc.nextInt();   // e.g. 15 for 15%
            sc.nextLine();

            double finalCost = r1.rawtotalCost(r1.noofFood, r1.noofDrink) * (1 - discountRate / 100.0);

            System.out.println("Total payable is $" + finalCost);
        }
        else{        System.out.println("Total payable is $"+r1.rawtotalCost(r1.noofFood, r1.noofDrink));}

        r1.paymentType ="";
        while (!r1.paymentType.equals("card"))
        {
            System.out.print("Enter payment type: ");
            r1.paymentType = sc.nextLine();
        }
        r1.cashierName = "Maria";

        r1.displayReceipt(r1.foodName, r1.drinkName, (int)r1.foodPrice, r1.drinkPrice, r1.cashierName);

    }
}
