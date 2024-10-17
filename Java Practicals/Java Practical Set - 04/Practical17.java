class Parent
{
    public void Print_Parent()
    {
        System.out.println("\nThis is Parent Class");
    }
}

class Child extends Parent
{
    public void Print_Child()
    {
        System.out.println("\nThis is Child Class");
    }
}

class Practical17
{
    public static void main(String[] args)
    {
        @SuppressWarnings("unused")

        Parent P1 = new Parent();
        Child C1 = new Child();

        C1.Print_Parent();
        C1.Print_Child();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("23DCS085 Meet K. Patel");

    }
}