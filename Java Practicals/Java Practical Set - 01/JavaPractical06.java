import java.util.*;
public class JavaPractical06
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int i;
        int Days;

        int a = 0;
        int b = 1;
        int c;

        System.out.println(" ");

        System.out.print("Enter Number of Days : ");
        Days = sc.nextInt();

        System.out.println(" ");

        for(i=0;i<Days;i++)
        {
                System.out.println("Day " + (i+1) + " : " + a);

                c = a + b;
                a = b;
                b = c;
        }

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("23DCS085 Meet K. Patel");

        sc.close();

    }
}