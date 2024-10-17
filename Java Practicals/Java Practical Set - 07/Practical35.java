import java.util.*;
public class Practical35
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println(" ");

        System.out.print("Enter the Value of n : ");
        n = sc.nextInt();

        System.out.println(" ");

        try
        {
            for(int i=1;i<=n;i++)
            {
                Thread.sleep(1000);

                System.out.println(i);
            }
        }
        catch(Exception e)
        {
            System.out.println(" ");
            System.out.println("Exception : " + e);
        }

        System.out.println(" ");
        System.out.println("23DCS085 Meet K. Patel");

        sc.close();
    }    
}
