import java.util.*;

class Employee
{
    private String First_name;
    private String Last_name;
    private double Monthly_salary;
    private double Yearly_salary;

    Scanner sc = new Scanner(System.in);

    public Employee()
    {
        First_name = "Employee_Name";
        Last_name = "Employee_surname";
        Monthly_salary = 0.0;
    }

    public void get_Data()
    {

        System.out.println(" ");

        System.out.print("Enter Employee's First Name : ");
        First_name = sc.nextLine();
        
        System.out.print("Enter Employee's Last Name : ");
        Last_name = sc.nextLine();

        System.out.print("Enter Employee's Monthly Salary : ");
        Monthly_salary = sc.nextInt();

        Yearly_salary = Monthly_salary*12;
    }

    public void put_Data()
    {

        if(Monthly_salary < 0)
        {
            Monthly_salary = 0.0;
        }

        System.out.println(" ");

        System.out.println("---: Employee's Detail's :---");

        System.out.println(" ");

        System.out.println("Employee's First Name : " + First_name);
        System.out.println("Employee's Last Name : " + Last_name);
        System.out.println("Employee's Monthly Salary : " + Monthly_salary);
        System.out.println("Employee's Yearly Salary : " + Yearly_salary);
    }

    public void Employee_salary_increament()
    {
        double increament_ration;
        double incremented_salary;
        System.out.println(" ");

        System.out.print("Enter Increament Ratio of Salary : ");
        increament_ration = sc.nextInt();
        incremented_salary = (increament_ration/100)*Yearly_salary;
        Yearly_salary += incremented_salary;
    }
}

class Practical13 
{
    public static void main(String[] args)
    {
        Employee E1 = new Employee();
        E1.put_Data();

        Employee E2 = new Employee();
        E2.get_Data();
        E2.put_Data();

        E2.Employee_salary_increament();
        E2.put_Data();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("23DCS085 Meet K. Patel");
    }
}
