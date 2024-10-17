
class Shape
{
    void Print_Shape()
    {
        System.out.println("\nThis is Shape");
    }
}

class Rectangle extends Shape
{
    void Print_Rectangle()
    {
        System.out.println("\nThis is Rectangular Shape");
    }
}

class Circle extends Shape
{
    void Print_Circle()
    {
        System.out.println("\nThis is Circular Shape");
    }
}

class Square extends Rectangle
{
    void Print_Square()
    {
        System.out.println("\nSquare is Rectangle");
    }
}

class Practical20 
{
    public static void main(String[] args)
    {

        Square S1 = new Square();

        S1.Print_Shape();
        S1.Print_Rectangle();
        S1.Print_Square();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("23DCS085 Meet K. Patel");
        
    }    
}
