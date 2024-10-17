import java.util.*;
class Practical25
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int x,y;

        try
        {
        System.out.println(" ");
            
        System.out.print("Enter Value of X : ");
        x = sc.nextInt();

        System.out.print("Enter Value of Y : ");
        y = sc.nextInt();

        if(y == 0)
        {
            throw new ArithmeticException("Number is Not Divided By Zero");
        }

        System.out.println(" ");
        System.out.println(x + "/" + y + " = " + x/y);
        
        }
        catch(InputMismatchException e)
        {
            System.out.println(" ");
            System.out.println("Exception : " + e);
        }
        catch(ArithmeticException e)
        {
            System.out.println(" ");
            System.out.println("Exception : " + e);
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("23DCS085 Meet K. Patel");
    }    
}
