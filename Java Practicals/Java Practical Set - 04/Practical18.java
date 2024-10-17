import java.util.*;
class Member
{

    Scanner sc = new Scanner(System.in);

    protected String Name;
    protected int Age;
    protected long Phone_Number;
    protected String Address;
    protected int Salary;

}

class Manager extends Member
{
    private String Department;

    void get_Data()
    {
        System.out.println("---: Enter Manager Detail's :---");

        System.out.print("\nEnter Name : ");
        Name = sc.nextLine();

        System.out.print("Enter Age : ");
        Age = sc.nextInt();

        System.out.print("Enter Phone Number : ");
        Phone_Number = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Address : ");
        Address = sc.nextLine();

        System.out.print("Enter Department : ");
        Department = sc.nextLine();

        System.out.print("Enter Salary : ");
        Salary = sc.nextInt();
    }

    void Display_Data()
    {
        System.out.println("\n---: Manager Detail's :---");

        System.out.println("\nName : " + Name);
        System.out.println("Age : " + Age);
        System.out.println("Phone Number : " + Phone_Number);
        System.out.println("Address : " + Address);
        System.out.println("Department : " + Department);
    }

    void Print_Salary()
    {
        System.out.println("\nManager Salary : " + Salary);
    }
}

class Employee extends Member
{
    private String Specialization;

    void get_Data2()
    {
        System.out.println("\n---: Enter Employee Detail's :---");

        System.out.print("\nEnter Name : ");
        Name = sc.nextLine();

        System.out.print("Enter Age : ");
        Age = sc.nextInt();

        System.out.print("Enter Phone Number : ");
        Phone_Number = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Address : ");
        Address = sc.nextLine();

        System.out.print("Enter Specialization : ");
        Specialization = sc.nextLine();

        System.out.print("Enter Salary : ");
        Salary = sc.nextInt();
    }

    void Display_Data2()
    {
        System.out.println("\n\n---: Employee Detail's :---");

        System.out.println("\nName : " + Name);
        System.out.println("Age : " + Age);
        System.out.println("Phone Number : " + Phone_Number);
        System.out.println("Address : " + Address);
        System.out.println("Specialization : " + Specialization);
    }

    void Print_Salary2()
    {
        System.out.println("\nEmployee Salary : " + Salary);
    }
}

class Practical18 
{
    public static void main(String[] args)
    {

        Manager M1 = new Manager();
        Employee E1 = new Employee();

        M1.get_Data();
        E1.get_Data2();

        M1.Display_Data();
        E1.Display_Data2();

        System.out.println(" ");

        M1.Print_Salary();
        E1.Print_Salary2();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("23DCS085 Meet K. Patel");
    }  
}
