import java.util.*;

class Complex
{

    private int Real;
    private int Img;

    Complex()
    {
        Real = 0;
        Img = 0;
    }

    public void get_Data()
    {

        Scanner sc = new Scanner(System.in);

        System.out.println(" ");

        System.out.print("Enter Real Part : ");
        Real = sc.nextInt();

        System.out.print("Enter Imaginary Part : ");
        Img = sc.nextInt();

    }

    public void Display_Data()
    {

        System.out.println(" ");

        System.out.println("Entered Complex Number : " + Real + " + (" + Img + ")i");
        
    }

    public void Addition(Complex C)
    {
        System.out.println(" ");

        System.out.println("---: Addition of Complex Numbers :---");

        System.out.println(" ");

        System.out.println("Sum = " + (Real + C.Real) + " + (" + (Img + C.Img) + ")i");

    }

    public void Difference(Complex C)
    {
        System.out.println(" ");

        System.out.println("---: Difference of Complex Numbers :---");

        System.out.println(" ");

        System.out.println("Difference = " + (Real + C.Real) + " + (" + (Img + C.Img) + ")i");

    }

    public void Product(Complex C)
    {
        System.out.println(" ");

        System.out.println("---: Product of Complex Numbers :---");

        System.out.println(" ");

        System.out.println("Product = " + ((Real * C.Real) - (Img * C.Img)) + " + (" + ((Real * C.Img) + (Img * C.Real)) + ")i");

    }

}

class Practical16 
{
    
    public static void main(String[] args)
    {

        Complex C1 = new Complex();

        C1.Display_Data();

        Complex C2 = new Complex();
        C2.get_Data();

        Complex C3 = new Complex();
        C3.get_Data();

        C2.Display_Data();
        C3.Display_Data();

        C2.Addition(C3);
        C2.Difference(C3);
        C2.Product(C3);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("23DCS085 Meet K. Patel");

    }
}
