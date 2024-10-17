import java.util.*;
class SupplementaryQ01
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int no_of_Books,Choice;
        int F_len,NF_Len;

        System.out.println(" ");

        System.out.print("Enter Total Number of Book's that you want to Add : ");
        no_of_Books = sc.nextInt();

        String[] Fiction = new String[no_of_Books];
        String[] Non_Fiction = new String[no_of_Books];

        System.out.println(" ");

        System.out.println("Press \"1\" for Fiction Books");
        System.out.println("Press \"2\" for Non - Fiction Books");
        System.out.println(" ");

        for(int i=0;i<no_of_Books;i++)
        {
        System.out.print("Select Category of Book - " + (i+1) + " From Below given Options : ");
        Choice = sc.nextInt();
        sc.nextLine();

        if(Choice == 1)
        {

            System.out.println(" ");

            System.out.print("Enter Name of Book - " + (i+1) + " : ");
            Fiction[i] = sc.nextLine();

            System.out.println(" ");
                
        }
        else if(Choice == 2)
        {

            System.out.println(" ");

            System.out.print("Enter Name of Book - " + (i+1) + " : ");
            Non_Fiction[i] = sc.nextLine();

            System.out.println(" ");
                
        }
        else
        {

            System.out.println(" ");

            System.out.println("Invalid Choice");

            System.out.println(" ");

            i--;
            continue;
        }
        }

        F_len = Fiction.length;
        NF_Len = Non_Fiction.length;

        String[] Inventory = new String[no_of_Books];

        System.out.println(" ");
        System.out.println("Total Number of Book's in Inventory : " + no_of_Books);

        System.out.println(" ");

        for(int i=0;i<no_of_Books;i++)
        {
            if(i < (F_len-1))
            {
                Inventory[i] = Fiction[i];
            }
            else
            {
                Inventory[i] = Non_Fiction[i];
            }
        }

        System.out.println(" ");

        for(int i=0;i<no_of_Books;i++)
        {
            System.out.println("Book - " + (i+1) + " : " + Inventory[i]);
        }

        sc.close();
        
    }
}