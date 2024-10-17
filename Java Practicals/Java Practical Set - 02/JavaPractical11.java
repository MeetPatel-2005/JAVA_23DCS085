import java.util.*;
public class JavaPractical11
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        String s1;

        System.out.println(" ");

        System.out.print("Enter Any String : ");
        s1 = sc.nextLine();

        System.out.println(" ");

        System.out.println("Length of a given string : " + s1.length());

        System.out.println(" ");

        System.out.println("Replacing \"H\" by first letter of your name : " + s1.replace("H","M"));

        System.out.println(" ");

        System.out.println("Lowercase form of a given string : " + s1.toLowerCase());

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("23DCS085 Meet K. Patel");

        sc.close();
    }
}