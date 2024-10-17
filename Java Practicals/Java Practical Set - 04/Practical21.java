
class Degree
{
    public void get_Degree()
    {
        System.out.println("I got a Degree");
    }
}

class Undergraduate extends Degree
{
    public void Print()
    {
        System.out.println("I am Undergraduate");
    }
}

class Postgraduate extends Degree
{
    public void Print()
    {
        System.out.println("I am Postgraduate");
    }
}

class Practical21
{
    public static void main(String[] args)
    {

        Degree D = new Degree();
        Undergraduate U = new Undergraduate();
        Postgraduate P = new Postgraduate();

        D.get_Degree();
        U.Print();
        P.Print();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("23DCS085 Meet K. Patel");
        
    }
}
