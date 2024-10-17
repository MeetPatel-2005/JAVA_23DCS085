import java.util.*;
public class JavaPractical08
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int i;
        int MAX_SIZE;
        int count9;

        System.out.println(" ");

        System.out.print("Enter Size of Array : ");
        MAX_SIZE = sc.nextInt();

        int[] Array = new int[MAX_SIZE];

        System.out.println(" ");

        System.out.println("---: Enter Elements of Array :---");

        System.out.println(" ");

        for(i=0;i<MAX_SIZE;++i)
        {
            Array[i] = sc.nextInt();
        }

        count9 = Array_count9(Array);

        System.out.println(" ");

        System.out.println("The Number of times 9 appears in the given Array is : " + count9);

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("23DCS085 Meet K. Patel");

    }

    public static int Array_count9(int[] arr)
    {
        int j,count = 0;

        for(j=0;j<arr.length;++j)
        {
            if(arr[j] == 9)
            {
                count++;
            }
        }

        return count;
    }
}