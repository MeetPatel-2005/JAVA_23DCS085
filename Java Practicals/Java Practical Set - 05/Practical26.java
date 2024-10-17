import java.io.IOException;
import java.util.*;
class Practical26
{

    int balance = 5000;
    int withDrawlAmount;

    Scanner sc = new Scanner(System.in);

    void checkInteger()throws IOException
    {
        System.out.print("Enter Withdrawl Ammount that you want to Withdraw : ");

         if(sc.hasNextInt())
         {
             withDrawlAmount = sc.nextInt();
         }
         else
         {
             throw new IOException("Enter Amount is Not an Integer Value");
         }
    }

    void checkNegative()throws IOException
    {
        if(withDrawlAmount < 0)
        {
            throw new IOException("Entered Amount is Negative Value");
        }
    }

    void checkInsufficientBalance()throws ArithmeticException
    {
        if(balance < withDrawlAmount)
        {
            throw new ArithmeticException("Insufficient Balance");
        }
    }

    void checkwithDrawlAmount()throws ArithmeticException
    {
        if(!(withDrawlAmount % 100 == 0 || withDrawlAmount % 50 == 0 || withDrawlAmount % 200 == 0 || withDrawlAmount % 500 == 0 || withDrawlAmount % 10 == 0 || withDrawlAmount % 20 == 0))
        {
            throw new ArithmeticException("Entered WithDrawl Amount is not a Multiple of 10,20,50,100,200 OR 500");
        }
    }

    void printCurrentBalance()
    {
        int currentBalance = balance - withDrawlAmount;

        if((balance != currentBalance) && (withDrawlAmount > 0) && (withDrawlAmount % 100 == 0 || withDrawlAmount % 50 == 0 || withDrawlAmount % 200 == 0 || withDrawlAmount % 500 == 0 || withDrawlAmount % 10 == 0 || withDrawlAmount % 20 == 0))
        {
            System.out.println(" ");
            System.out.println("Amount is Withdrawed Successfully");
            System.out.println(" ");
            System.out.println("Current Balance : " + currentBalance);
        }
        else
        {
            System.out.println(" ");
            System.out.println("Invalid WithDrawl Amount Entered");
        }
    }

    public static void main(String[] args) throws ArithmeticException
    {

        System.out.println(" ");

        Practical26 P1 = new Practical26();

        try
        {
            P1.checkInteger();
        }
        catch(IOException e)
        {
            System.out.println(" ");
            System.out.println("Exception : " + e);
        }

        try
        {
            P1.checkNegative();
        }
        catch(IOException e)
        {
            System.out.println(" ");
            System.out.println("Exception : " + e);
        }

        try
        {
            P1.checkInsufficientBalance();
        }
        catch(ArithmeticException e)
        {
            System.out.println(" ");
            System.out.println("Exception : " + e);
        }

        try
        {
            P1.checkwithDrawlAmount();
        }
        catch(ArithmeticException e)
        {
            System.out.println(" ");
            System.out.println("Exception : " + e);
        }

        P1.printCurrentBalance();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("23DCS085 Meet K. Patel");

    }    
}
