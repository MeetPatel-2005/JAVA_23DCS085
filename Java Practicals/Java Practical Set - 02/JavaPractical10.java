import java.util.*;
public class JavaPractical10
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int i;
        String s1;

        System.out.println(" ");

        System.out.print("Enter Any String : ");
        s1 = sc.nextLine();

        System.out.println(" ");

        System.out.println("Length of a given string : " + s1.length());

        System.out.println("Lowercase form of a given string : " + s1.toLowerCase());

        System.out.println("Uppercase form of a given string : " + s1.toUpperCase());

        System.out.print("Reverse form of a given string : ");

        char[] arr = s1.toCharArray();

        for(i=s1.length()-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }

        Arrays.sort(arr);

        System.out.println(" ");

        System.out.print("Sorted form of a given string : ");

        for(i=0;i<s1.length();i++)
        {
            System.out.print(arr[i]);
        }

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("23DCS085 Meet K. Patel");


        sc.close();

    }
}