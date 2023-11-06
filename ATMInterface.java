import java.util.Scanner;

public class ATMInterface 
{
    private double balance;
    private Scanner scanner;

    public ATMInterface() 
    {
        balance = 15000;
        scanner = new Scanner(System.in);
    }

    public void displayMenu() 
    {
        int choice;
        do 
        {
            System.out.println("-----***** Welcome to ATM *****-----");
            System.out.println("ATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                {
                    withdraw();
                    break; 
                }
                case 2:
                {
                    deposit();
                    break;
                }
                    case 3:
                { 
                    checkBalance();
                    break;
                }
                    case 4:
                {
                    System.out.println("Thank you for using this ATM. Have a nice day!!");
                    break;
                }
                    default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private void withdraw() 
    {
        System.out.println("Enter the amount to withdraw: ");
        double withdrawamount = scanner.nextDouble();
        if (withdrawamount >= 500 && withdrawamount <= balance) 
        {
            balance -= withdrawamount;
            System.out.println("" + withdrawamount + " withdraw has been success!!. Have a great day!!");
        } else 
        {
            System.out.println("Invalid amount  Minimum withdrawal is 500 or insufficient balance. Please try again. withdraw has been failed");
        }
    }

    private void deposit() 
    {
        System.out.println("Enter the amount to deposit: ");
        double depositamount = scanner.nextDouble();
        if (depositamount > 500) 
        {
            balance += depositamount;
            System.out.println("" + depositamount + " has been deposited.Have a Wonderful day");
        } else 
        {
            System.out.println("Invalid amount Minimum deposit is 500. Please try again.");
        }
    }

    private void checkBalance() 
    {
        System.out.println("Your account balance is: " + balance);
    }

    public static void main(String[] args) 
    {
        ATMInterface atm = new ATMInterface();
        atm.displayMenu();
    }
}
