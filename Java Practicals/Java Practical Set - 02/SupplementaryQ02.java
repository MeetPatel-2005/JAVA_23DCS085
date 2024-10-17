import java.util.*;
class SupplementaryQ02 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        int i = 0,count = 1;
        String str;

        System.out.println(" ");

        System.out.print("Enter Any String : ");
        str = sc.nextLine();

        char[] Arr = str.toCharArray();

        char[] Arr_2 = new char[Arr.length];

       System.arraycopy(Arr, 0, Arr_2, 0, Arr.length);

        Arrays.sort(Arr_2);

        while(i < Arr_2.length-1)
        {
            if(Arr_2[i] == Arr_2[i+1])
            {
                count++;
            }
            else if(count>1)
            {
                System.out.println(Arr_2[i] + " Appears " + count + " Times");

                count = 1;
            }

            i++;
        }

        if(count > 1)
        {
            System.out.println(Arr_2[Arr_2.length - 1] + " Appears " + count + " Times");
        }
        
    }
}
