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

    // behaviours ("methods")
    int calculateMPG(int milesDriven, int gallonsUsed)
    {
        return milesDriven / gallonsUsed;
    }

    void displayOwner(String ownerName){

        System.out.println("Owner:"+" "+ownerName);
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // ask input from user thru CLI
        String A = sc.nextLine();
        car myCar = new car(); // JVM create the object
        myCar.color = "red";
        myCar.model = "camry";
        myCar.year = 2022;

        // car myCar2 = new car("blue","camry",2020); both

        System.out.println(A+" "+myCar.color);
        System.out.println(myCar.calculateMPG(180, 20));
        myCar.displayOwner("Sam");
    }
}
