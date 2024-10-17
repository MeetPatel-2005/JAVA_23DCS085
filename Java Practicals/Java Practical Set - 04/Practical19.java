import java.util.*;
class Rectangle
{
    float Length;
    float Breadth;

    public Rectangle()
    {
        Length = 0;
        Breadth = 0;
    }

    public Rectangle(float Length,float Breadth)
    {
        this.Length = Length;
        this.Breadth = Breadth;
    }

    void Perimeter()
    {
        System.out.println("\nPerimeter of Rectangle is : " + 2*(Length+Breadth));
        System.out.println("Perimeter of Square is : " +  4*Length);
    }

    void Area()
    {
        System.out.println("\nArea of Rectangle is : " + Length*Breadth);
        System.out.println("Area of Square is : " + Length*Length);
    }
}

class Square extends Rectangle
{
    public Square(float S)
    {
        super(S,S);
    }
}

class Practical19 
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int no_of_object;
        float L;

        System.out.println(" ");

        System.out.print("Enter the number of Object's that you want to create : ");
        no_of_object = sc.nextInt();

        Square[] S = new Square[no_of_object];

        for(int i=0;i<no_of_object;i++)
        {
            System.out.print("\nEnter the Value of Length : ");
            L = sc.nextFloat();

            S[i] = new Square(L);

            S[i].Perimeter();
            S[i].Area();
        }

        sc.close();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("23DCS085 Meet K. Patel");

    }  
}
