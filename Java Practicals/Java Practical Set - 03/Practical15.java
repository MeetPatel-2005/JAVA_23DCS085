import java.util.*;
class Area
{

    private float Length;
    private float Breadth;
    private float rec_Area;

    public Area()
    {
        Length = 0;
        Breadth = 0;
    }

    public Area(float X,float Y)
    {
        Length = X;
        Breadth = Y;
    }

    public float returnArea()
    {
        rec_Area = Length*Breadth;

        return rec_Area;
    }

}

class Practical15 
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        
        float A,B,area1,area2;

        Area A1 = new Area();

        System.out.println(" ");

        System.out.print("Enter the value of Length for Rectangle : ");
        A = sc.nextFloat();

        System.out.print("Enter the value of Breadth for Rectangle : ");
        B = sc.nextFloat();

        Area A2 = new Area(A,B);
        
        area1 = A1.returnArea();
        area2 = A2.returnArea();

        System.out.println(" ");

        System.out.println("Area of Rectangle : " + area1);

        System.out.println(" ");

        System.out.println("Area of Rectangle : " + area2);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("23DCS085 Meet K. Patel");

        sc.close();

    }

}
