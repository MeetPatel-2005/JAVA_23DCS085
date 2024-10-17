import java.util.*;
class Practical24
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int x,y;

        try{
            System.out.println(" ");
            
            System.out.print("Enter Value of X : ");
            x = sc.nextInt();
    
            System.out.println(" ");
    
            System.out.print("Enter Value of Y : ");
            y = sc.nextInt();

            System.out.println(" ");
            System.out.println(x + "/" + y + " = " + x/y);
        }
        catch(InputMismatchException e)
        {
            System.out.println(" ");
            System.out.println("Entered Numbers are not an Integers");
        }
        catch(ArithmeticException e)
        {
            System.out.println(" ");
            System.out.println("Number is not Divide by Zero");
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("23DCS085 Meet K. Patel");

        sc.close();
    }
}