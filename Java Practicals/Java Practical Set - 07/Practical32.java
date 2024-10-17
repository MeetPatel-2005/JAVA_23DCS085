
class A extends Thread
{
    public void run()
    {
        System.out.println("Hello World");
    }
}

class B implements Runnable
{
    public void run()
    {
        System.out.println("Hello World");
    }
}

public class Practical32
{
    public static void main(String[] args)
    {

        A t1 = new A();

        t1.start();

        B obj = new B();
        Thread t2 = new Thread(obj);

        t2.start();

        System.out.println(" ");
        System.out.println("23DCS085 Meet K. Patel");
    }    
}
