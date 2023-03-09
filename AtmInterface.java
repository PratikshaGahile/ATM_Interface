package Java_project;
import java.util.Scanner;
public class AtmInterface
{
    public static void main(String args[])
    {
        int balance = 40000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        int pin=4444;
        System.out.println("Please enter your pin number: ");
        int pass=sc.nextInt();
        int i=1;
        if(pass!=pin)
        {
            while(true)
            {
                i++;
                System.out.println("Wrong pin Number!! ");
                System.out.println("Please Re-enter your correct  pin Max 3 attempt : ");
                pass=sc.nextInt();
                if(pass==pin)
                {
                    break;
                }
                if(i==3){
                    //user will get 3 maximum attempts to re-enter the pin number
                    System.out.println("You have exceeded your trials !! Retry After some time !");
                    System.exit(0);
                }
            }
        }

        if(pass==pin)
        {
            System.out.println("<------Welcome to ATM services------>");
            while(true)
            {
                System.out.println("Enter 1 CHECK THE BALANCE AMMOUNT ");
                System.out.println("Enter 2 WITHDRAW THE MONEY ");
                System.out.println("Enter 3 DEPOSIT MONEY");
                System.out.println("Enter 4 QUIT");

                System.out.print("Choose what you want from option: \n");
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                        System.out.println("Your Balance is : "+balance);
                        System.out.println("");
                        break;

                    case 2:
                        System.out.println("Enter amount you want to Withdraw : ");
                        withdraw=sc.nextInt();
                        if(withdraw>balance||balance==0)           //if balance is less than withdraw ammount
                        {
                            System.out.print("You have insufficient balance!!\n");
                            break;
                        }
                        System.out.println("Hope you collected your amount!");
                        balance=balance-withdraw;
                        System.out.println("");
                        break;

                    case 3:
                        System.out.print("Enter Amount  to be deposited: ");
                        deposit = sc.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your Money has been successfully deposited");
                        System.out.println(" ");
                        break;

                    case 4:
                        System.out.println("Thank you for using ATM!");
                        System.exit(0);

                    default:
                        System.out.println("WRONG CHOICE ENTERED ");
                        break;
                }
            }
        }
    }
}