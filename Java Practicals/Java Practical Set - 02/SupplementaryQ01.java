import java.util.*;
class SupplementaryQ01
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        String str,del_str,Repl_str;

        System.out.println(" ");

        System.out.print("Enter Any String : ");
        str = sc.nextLine();

        System.out.println(" ");

        System.out.print("Enter The Sub - String that you want to Replace from the String : ");
        del_str = sc.nextLine();

        System.out.println(" ");

        System.out.print("Enter Replacement String : ");
        Repl_str = sc.nextLine();

        System.out.println(" ");

        System.out.println("---: Result String :---");

        System.out.println(" ");

        System.out.println(str.replaceAll(del_str,Repl_str));
    }
}