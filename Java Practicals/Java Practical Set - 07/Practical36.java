
class A extends Thread
{
    public void run()
    {

    }
}

public class Practical36
{
    public static void main(String[] args)
    {
        A First = new A();
        A Second = new A();
        A Third = new A();

        System.out.println(" ");

        System.out.println("---: Before Setting Name And Priority of Thread :---");

        System.out.println(" ");

        System.out.println("[1.] Name : " + First.getName() + " , Priority of Thread : " + First.getPriority());
        System.out.println("[2.] Name : " + Second.getName() + " , Priority of Thread : " + Second.getPriority());
        System.out.println("[3.] Name : " + Third.getName() + " , Priority of Thread : " + Third.getPriority());

        System.out.println(" ");

        First.setName("FIRST");
        Second.setName("SECOND");
        Third.setName("THIRD");

        First.setPriority(3);
        Second.setPriority(5);
        Third.setPriority(7);

        System.out.println("---: After Setting Name And Priority of Thread :---");

        System.out.println(" ");

        System.out.println("[1.] Name : " + First.getName() + " , Priority of Thread : " + First.getPriority());
        System.out.println("[2.] Name : " + Second.getName() + " , Priority of Thread : " + Second.getPriority());
        System.out.println("[3.] Name : " + Third.getName() + " , Priority of Thread : " + Third.getPriority());

        System.out.println(" ");
        System.out.println("23DCS085 Meet K. Patel");
    }    
}
