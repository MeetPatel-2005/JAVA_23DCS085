import java.util.*;

class Date
{
    private int Day;
    private int Month;
    private int Year;

    Scanner sc = new Scanner(System.in);

    public Date()
    {
        Day = 0;
        Month = 0;
        Year = 0;
    }

    public void set_Data(int D,int M,int Y)
    {
        Day = D;
        Month = M;
        Year = Y;
    }

    public void get_Data()
    {
        System.out.println(" ");

        for(int i=0;i<1;i++)
        {

        System.out.print("Enter Date : ");
        Day = sc.nextInt();

        if(Day<=0 || Day > 31)
        {
            System.out.println(" ");

            System.out.println("Entered Invalid Date");

            System.out.println(" ");

            i--;
        }

        }

        for(int i=0;i<1;i++)
        {

        System.out.print("Enter Month : ");
        Month = sc.nextInt();

        if(Month <= 0 || Month > 12)
        {
            System.out.println(" ");

            System.out.println("Entered Invalid Month");

            System.out.println(" ");

            i--;
        }
        }

        for(int i=0;i<1;i++)
        {

        System.out.print("Enter Year : ");
        Year = sc.nextInt();

        if(Year <= 0)
        {
            System.out.println(" ");

            System.out.println("Entered Invalid Year");

            System.out.println(" ");

            i--;
        }
        }

    }

    public void Display_Data()
    {
        System.out.println(" ");

        System.out.println("Date : " + Day + "/" + Month + "/" + Year);
    }

}

class Practical14 
{
    public static void main(String[] args)
    {
    Date D1 = new Date();

    Date D2 = new Date();

    D2.get_Data();

    D1.Display_Data();
    D2.Display_Data();

    System.out.println(" ");
    System.out.println(" ");
    System.out.println("23DCS085 Meet K. Patel");

    }

}
