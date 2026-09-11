import java.util.Scanner;

public class BankAccount {

    // Instance/Runtime Variables
    String accountHolder;
    double accountBalance;
    String accountNumber;
    String accountType;

    // Static (belongs to class) Variables
    static int totalAccounts = 0;
    static double interestRate = 3.5;  // 3.5% annual interest

    // Final Variables (cannot be reassigned) & parameterised at every constructor
    final String accountID;
    static final String bankName = "DBS";
    static final double minBalance = 100.0;  // Minimum balance required


    //Constructor
    BankAccount(String accountHolder,double accountBalance,String accountNumber,String accountType,String accountID)
    {
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountID = accountID;
        totalAccounts++;
    }

    //Instance method
    void deposit(double amount)
    {
        accountBalance = accountBalance + amount;
        System.out.println("Deposited: $" + amount);
    }
    // Static Method
    static void showBankInfo()
    {
        System.out.println("Bank: " + bankName);
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public static void main(String[] args) {
        System.out.println("");
        BankAccount BA1 = new BankAccount("John", 5000, "ACC001", "Savings","ID-001");
        BankAccount BA2 = new BankAccount("Doe", 10000, "ACC002","Current","ID-002");

        BA1.deposit(100);
        BA2.deposit(500);

        BankAccount.showBankInfo();

        System.out.println(BA1.accountID);
        System.out.println(BankAccount.bankName); // static method only access static
    }
}
