import java.time.LocalTime;
import java.util.*;
class Airplane
{
    private String Flight_Number;
    private String Destination;
    private int Departure_Hour;
    private int Departure_Minute;
    private LocalTime Depature_Time;

    public void get_Data()
    {

        Scanner sc = new Scanner(System.in);

        System.out.println(" ");

        System.out.print("Enter the Flight Number : ");
        Flight_Number = sc.nextLine();

        System.out.print("Enter the Flight Destination : ");
        Destination = sc.nextLine();

        for(int i=0;i<1;i++)
        {

        System.out.print("Enter the Flight Departure Time of Flight in Hour : ");
        Departure_Hour = sc.nextInt();

        if(Departure_Hour > 24 || Departure_Hour < 0)
        {
            System.out.println(" ");
            System.out.println("Invalid Time Entered");
            System.out.println(" ");
            i--;
        }

        }

        for(int i=0;i<1;i++)
        {

        System.out.print("Enter the Flight Departure Time of Flight in Minutes : ");
        Departure_Minute = sc.nextInt();

        if(Departure_Minute> 60 || Departure_Minute < 0)
        {
            System.out.println(" ");
            System.out.println("Invalid Time Entered");
            System.out.println(" ");
            i--;
        }

        }

        Depature_Time = LocalTime.of(Departure_Hour,Departure_Minute);

        sc.close();

    }

    public void put_Data()
    {

        System.out.println(" ");

        System.out.println("---: Flight Statue :---");

        System.out.println(" ");

        System.out.println("Flight Number : " + Flight_Number);
        System.out.println("Flight Destination : " + Destination);
        System.out.println("Flight Departure Time : " + Depature_Time);
    }


}

class Supplementary_Q01
{
    public static void main(String[] args)
    {

        Airplane A = new Airplane();

        A.get_Data();
        A.put_Data();

    }    
}
