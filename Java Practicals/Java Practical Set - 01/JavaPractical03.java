import java.util.*;
class JavaPractical03 
{
    public static void main(String[] args)
    {

        float Distance_in_meters;
        float Time_in_hour;
        float Time_in_minute;
        float Time_in_seconds;

        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter Distance in meters : ");
        Distance_in_meters = sc.nextFloat();

        System.out.println(" ");

        System.out.print("Enter Time taken for the distance in hours : ");
        Time_in_hour = sc.nextFloat();

        System.out.println(" ");

        System.out.print("Enter Time taken for the distance in minutes : ");
        Time_in_minute = sc.nextFloat();

        System.out.println(" ");

        System.out.print("Enter Time taken for the distance in seconds : ");
        Time_in_seconds = sc.nextFloat();

        float Time_1;
        float Time_2;
        float Distance_2;
        float Distance_3;
        float Speed;
        float Speed_2;
        float Speed_3;

        Distance_2 = Distance_in_meters/1000;
        Distance_3 = Distance_in_meters/1609;

        Time_1 = ((Time_in_hour*60*60)+(Time_in_minute*60)+(Time_in_seconds));
        Time_2 = Time_in_hour+(Time_in_minute/60)+(Time_in_seconds/3600);

        Speed = Distance_in_meters/Time_1;
        Speed_2 = Distance_2/Time_2;
        Speed_3 = Distance_3/Time_2;

        System.out.println(" ");

        System.out.print("Speed : " + Speed + " M/S");

        System.out.println(" ");

        System.out.print("Speed : " + Speed_2 + " KM/H");

        System.out.println(" ");

        System.out.print("Speed : " + Speed_3 + " Mile/H");

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("23DCS085 Meet K. Patel");

        sc.close();

    }
}
