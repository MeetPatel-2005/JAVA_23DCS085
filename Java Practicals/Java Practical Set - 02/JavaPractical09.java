import java.util.*;
public class JavaPractical09
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        String s1;

        System.out.println(" ");

        System.out.print("Enter Any String : ");
        s1 = sc.nextLine();

        System.out.println(" ");

        System.out.println("---: After doubling every char in string the output string is :---");

        System.out.println(" ");

        Double_char(s1);

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("23DCS085 Meet K. Patel");

        sc.close();

    }

    public static boolean Double_char(String s2)
    {

        int i = 0,count = 0;
        int str_len = s2.length();

        char[] arr = s2.toCharArray();

        while(i<str_len)
        {
            if(count>1)
            {
                count = 0;
                i++;

                continue;
            }

            System.out.print(arr[i]);
            count++;
        }

        return true;
    }
}
