import java.util.*;
class SupplementaryQ02 
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int no_of_Stu;

        System.out.println(" ");

        System.out.print("Enter the Number of Students whose Grade Detail's you want to Enter : ");
        no_of_Stu = sc.nextInt();

        int[] Grade = new int[no_of_Stu];

        for(int i=0;i<no_of_Stu;i++)
        {

            System.out.println(" ");

            System.out.print("Enter Grade of Student - " + (i+1) + " : ");
            Grade[i] = sc.nextInt();
            
        }

        System.out.println(" ");

        System.out.println("---: Student's Grade Detail's :---");

        System.out.println(" ");

        for(int i=0;i<no_of_Stu;i++)
        {
            System.out.println("Grade's of Student - " + (i+1) + " : " + Grade[i]);

            if(Grade[i] > 50)
            {
                System.out.println(" ");

                System.out.println("Student - " + (i+1) + " Passed");

                System.out.println(" ");
            }

            if(Grade[i] < 50)
            {
                System.out.println(" ");

                System.out.println("Student - " + (i+1) + " Need Improvement");

                System.out.println(" ");
            }
        }

        sc.close();
    }
}
