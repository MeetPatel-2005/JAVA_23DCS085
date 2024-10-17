import java.util.*;
import java.io.*;

class StackClass
{
    public int MAX_SIZE;
    public int top;
    public ArrayList<Integer> Stack;

    public StackClass(int MAX_SIZE)
    {
        this.MAX_SIZE = MAX_SIZE;
        this.Stack = new ArrayList<>(MAX_SIZE);
        this.top = -1;
    }

    public int getSize()
    {
        int countStack = Stack.size();

        return countStack;
    }

    public boolean isEmpty()
    {
        if(Stack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int peek()
    {
        if(top == -1)
        {
            return 0;
        }
        else
        {
            return Stack.get(top);
        }
    }

    public void push(int Element)
    {
        if(top == (MAX_SIZE - 1))
        {
            System.out.println("\nStack is Full");
        }
        else
        {
            top = top + 1;
            Stack.add(top,Element);

            System.out.println("\nElement " + Element + " is Successfully Entered in Stack");
        }
    }

    public void pop()
    {
        int popElement = 0;

        if(top == -1)
        {
            System.out.println("\nStack is Empty");
        }
        else
        {
            popElement = Stack.get(top);
            Stack.remove(top);
            top = top - 1;

            System.out.println("\nElement " + popElement + " is Successfully Removed From the Stack");
        }
    }

    public void Display_Stack()
    {
        System.out.println("\n---: Printing Stack :---");

        System.out.println(" ");

        System.out.println(Stack);
    }

}

class Practical38
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int Stack_Size;

        System.out.print("\nEnter Size of Stack : ");
        Stack_Size = sc.nextInt();

        StackClass S = new StackClass(Stack_Size);

        int choice;

        System.out.println("\nPress \"1\" to Perform isEmpty Operation");
        System.out.println("Press \"2\" to Perform getSize Operation");
        System.out.println("Press \"3\" to Perform push Operation");
        System.out.println("Press \"4\" to Perform pop Operation");
        System.out.println("Press \"5\" to Perform peek Operation");
        System.out.println("Press \"6\" to Display Stack");
        System.out.println("Press \"7\" to Exit");

        for(int i=0;i<1;i++)
        {

        System.out.print("\nEnter Your Choice Here : ");
        choice = sc.nextInt();

        char checkChoice;

        switch (choice) 
        {
            case 1:
            {
                boolean result1 = S.isEmpty();

                System.out.println("Result of isEmpty : " + result1);

                System.out.print("\nYou want to Continue(Y/N) : ");
                checkChoice = sc.next().charAt(0);

                if(checkChoice == 'Y' || checkChoice == 'y')
                {
                    i--;
                }
                break;
            }
            case 2:
            {
                System.out.println("Size of Stack : " + S.getSize());

                System.out.print("\nYou want to Continue(Y/N) : ");
                checkChoice = sc.next().charAt(0);

                if(checkChoice == 'Y' || checkChoice == 'y')
                {
                    i--;
                }
                break;
            }
            case 3:
            {
                int pushElement;

                System.out.print("\nEnter Element that you want to Push in Stack : ");
                pushElement = sc.nextInt();

                S.push(pushElement);

                System.out.print("\nYou want to Continue(Y/N) : ");
                checkChoice = sc.next().charAt(0);

                if(checkChoice == 'Y' || checkChoice == 'y')
                {
                    i--;
                }
                break;
            }
            case 4:
            {
                S.pop();

                System.out.print("\nYou want to Continue(Y/N) : ");
                checkChoice = sc.next().charAt(0);

                if(checkChoice == 'Y' || checkChoice == 'y')
                {
                    i--;
                }
                break;
            }
            case 5:
            {
               if(S.peek() != 0)
               {
               System.out.println("\nPeek Element of Stack is : " + S.peek());
               }
               else
               {
                System.out.println("\nStack is Empty");
               }

               System.out.print("\nYou want to Continue(Y/N) : ");
                checkChoice = sc.next().charAt(0);

                if(checkChoice == 'Y' || checkChoice == 'y')
                {
                    i--;
                }
                break;
            }
            case 6:
            {
                if(S.isEmpty())
                {
                    System.out.println("Stack is Empty");
                }
                else
                {
                    S.Display_Stack();
                }

                System.out.print("\nYou want to Continue(Y/N) : ");
                checkChoice = sc.next().charAt(0);

                if(checkChoice == 'Y' || checkChoice == 'y')
                {
                    i--;
                }
                break;
            }
            case 7:
            {
                break;
            }
        
            default:
            {
                System.out.println("Invalid Choice");

                i--;

                break;
            }
        }

        }

    System.out.println("23DCS085 Meet K. Patel");
    }
}