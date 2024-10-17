import java.util.*;
class JavaPractical04 
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int i;
        int[] Exp = new int[30];
        int Total_Expenses = 0;

        System.out.println("---: Enter your monthly expenses here :---");

        for(i=0;i<30;i++)
        {

            System.out.print("Enter Expenses for Day - " + (i+1) + " : ");

            Exp[i] = sc.nextInt();

            Total_Expenses += Exp[i];

        }

        System.out.println(" ");

        System.out.println("Total Monthly Expenses is : " + Total_Expenses);

        System.out.println(" ");

        System.out.println("23DCS085 Meet K. Patel");

        sc.close();

    }

}
