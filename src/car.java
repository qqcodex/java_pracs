import java.util.Scanner;

public class car
{
    // states ("characteristics")
    String color;
    String model;
    String ownerName;
    int year;
    int milesDriven;
    int gallonsUsed;
    boolean isElectric;

    // behaviours ("methods")
    int calculateMPG(int milesDriven, int gallonsUsed)
    {
        return milesDriven / gallonsUsed;
    }

    void displayYearReleased(String ownerName){

        System.out.println("Model released on:"+" "+year);
    }

    // default constructor
    public car ()
    {}
    // parameterized constructor: >= states in a class
    public car (String color)
    {
        this.color = color;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // ask input from user thru CLI
        car myCar = new car(); // JVM create the object
        /* myCar.color = "red";
        myCar.model = "camry";

        System.out.print("Enter owner name: ");
        myCar.ownerName = sc.nextLine();

        System.out.print("Enter car year: ");
        myCar.year = sc.nextInt();

        System.out.print("Enter miles driven: ");
        myCar.milesDriven = sc.nextInt();

        System.out.print("Enter gallons used: ");
        myCar.gallonsUsed = sc.nextInt(); //will leave null/char

        sc.nextLine(); // without this line, sc.NextBoolean() will consume the leftover from the previous sc.nextInt()
        System.out.print("IS the car electric? (true/false): ");
        myCar.isElectric = sc.nextBoolean();

        System.out.println("The"+" "+myCar.color+" "+myCar.model+" "+"is owned by "+myCar.ownerName);
        System.out.println(myCar.calculateMPG(180, 20));
        myCar.displayYearReleased("Sam"); */
        car thisCar = new car("Blue"); //new instance
        System.out.println(thisCar); //if u print object, it will give memory location
        System.out.println(thisCar.color);
        car thatCar = new car("Silver");
        System.out.println(thatCar.color);

        /* public car (String color)
        {
            this.color = color;
        } */
    }
}
