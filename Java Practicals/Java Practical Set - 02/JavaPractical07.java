import java.util.*;
public class JavaPractical07
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int n,i;
        String s1;

        System.out.println(" ");

        System.out.print("Enter Any String : ");
        s1 = sc.nextLine();

        System.out.println(" ");

        System.out.print("How many times do you want to print the substring : ");
        n = sc.nextInt();

        System.out.println(" ");

        for(i=0;i<n;++i)
        {
            System.out.print(front_times(s1));
        }

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("23DCS085 Meet K. Patel");

        sc.close();
        
    }

    public static String front_times(String s2)
    {

        int str_len = s2.length();

        if(str_len >= 3)
        {
            return s2.substring(0,3);
        }
        else
        {
            return  s2.substring(0,str_len);
        }
    }
}