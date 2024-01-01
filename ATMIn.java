import java.util.Scanner;

class Account
{
    private double balance;
    public Account(double initialBalance)
    {
        balance=initialBalance;
    }
    public double getBalance()
    {
        return balance;
    }
    public void withdraw(double amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance-=amount;
            System.out.println("Withdrawal successful.Your new balance:"+balance);
        }
        else if(amount<=0)
        {
            System.out.println("Invalid amount");
        }
        else
        {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Deposit successful.New balance:"+balance);
        }
        else
        {
            System.out.println("Invalid amount");
        }
    }
}
class ATM
{
    private Account userAcc;
    private Scanner scanner;
    public ATM(Account account)
    {
        userAcc=account;
        scanner=new Scanner(System.in);
    }
    public void displayMenu()
    {
        System.out.println("ATM Menu:");
        System.out.println("1.check balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
    }
    public void processTransaction()
    {
        int choice;
        System.out.println("*****   Welcome to ATM  ******");
        System.out.println("Enter Your Account number:");
        String Accnum=scanner.next();
        System.out.println("Enter your pin number(4 digit): ");
        String pinnum=scanner.next();
        do
        {
            displayMenu();
            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Your balance:"+userAcc.getBalance());
                    break;
                case 2:
                    System.out.println("Enter your deposit amount:");
                    double withdrawalAmount=scanner.nextDouble();
                    userAcc.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Enter the withdrawal amount:");
                    /*double withdrawalAmount=scanner.nextDouble();*/
                    userAcc.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice");
            } 
        }while(choice!=4);

    }
}
public class ATMIn
{
    public static void main(String[] args)
    {
        Account userAcc=new Account(0.0);
        ATM atm=new ATM(userAcc);
        atm.processTransaction();
    }
}