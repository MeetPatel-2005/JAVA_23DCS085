import java.util.*;
interface AdvancedArithmatic
{
    int divisor_sum(int n);    
}

class calledMyCalculator implements AdvancedArithmatic
{
    public int divisor_sum(int n)
    {

        int temp = 0;

        for(int i=1;i<=n;i++)
        {
            if(n % i == 0)
            {
                temp += i;
            }
        }

        return temp;
    }
}

class Practical22
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        calledMyCalculator C1 = new calledMyCalculator();

        int A,B;

        System.out.println(" ");

        System.out.print("Enter Any Number : ");
        A = sc.nextInt();

        B = C1.divisor_sum(A);

        System.out.println(" ");

        System.out.println("Sum of all Divisors of " + A + " is : " + B);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("23DCS085 Meet K. Patel");

        sc.close();
    }
}
