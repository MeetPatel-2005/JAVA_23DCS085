import java.util.*;
class JavaPractical05
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        int[] Product_code = {1,2,3,4,5};
        float[] Product_price = {100,50,30,20,10};

        float MOTOR_TAX = 0.08f;
        float FAN_TAX = 0.12f;
        float TUBELIGHT_TAX = 0.05f;
        float WIRES_TAX = 0.075f;
        float OTHER_TAX = 0.03f;

        int Motor_count = 0;
        int Fan_count = 0;
        int Tubelight_count = 0;
        int Wires_count = 0;
        int Other_count = 0;

        float Motor_price = Product_price[0] + Product_price[0] * MOTOR_TAX;
        float Fan_price = Product_price[1] + Product_price[1] * FAN_TAX;
        float Tubelight_price = Product_price[2] + Product_price[2] * TUBELIGHT_TAX;
        float Wires_price = Product_price[3] + Product_price[3] * WIRES_TAX;
        float Other_price = Product_price[4] + Product_price[4] * OTHER_TAX;

        float Total_bill_ammount = 0;

        System.out.println("+-------------------------------------+");
        System.out.println("|        Electric Appliance Shop      |");
        System.out.println("+-------------------------------------+");
        System.out.println("|                                     | ");
        System.out.println("| -> Press \"1\" to buy a Motor         |");
        System.out.println("| -> Press \"2\" to buy a Fan           |");
        System.out.println("| -> Press \"3\" to buy a Tube Light    |");
        System.out.println("| -> Press \"4\" to buy a Wires         |");
        System.out.println("| -> Press \"5\" to buy all other items |");
        System.out.println("|                                     | ");
        System.out.println("+-------------------------------------+");

        System.out.println(" ");

        System.out.print("How many items that you want to buy : ");
        n = sc.nextInt();

        int i;
        int choice;

        for(i=0;i<n;i++)
        {

            System.out.println(" ");
            System.out.print("Select item - " + (i+1) + " that you want to buy : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                {
                    Motor_count++;
                    Total_bill_ammount += Motor_price;
                    break;
                }

                case 2:
                {
                    Fan_count++;
                    Total_bill_ammount += Fan_price;
                    break;
                }

                case 3:
                {
                    Tubelight_count++;
                    Total_bill_ammount += Tubelight_price;
                    break;
                }

                case 4:
                {
                    Wires_count++;
                    Total_bill_ammount += Wires_price;
                    break;
                }

                case 5:
                {
                    Other_count++;
                    Total_bill_ammount += Other_price;
                    break;
                }
            }
        }

        System.out.println(" ");

        System.out.println("+---------------------------------------------------------------------+");
        System.out.println("|                    Electric Appliance Shop Bill                     |");
        System.out.println("+---------------------------------------------------------------------+");
        System.out.println("|  SR NO.  |  Product Code  |  Product Name  |  Quantity  |   Price   |");
        System.out.println("+---------------------------------------------------------------------+");
        System.out.println("|          |                |                |            |           | ");
        System.out.println("|    1.    |        " + Product_code[0] + "       | MOTOR          |     " + Motor_count + "      | " + Motor_price + "     |");
        System.out.println("|    2.    |        " + Product_code[1] + "       | FAN            |     " + Fan_count + "      | " + Fan_price + "      |");
        System.out.println("|    3.    |        " + Product_code[2] + "       | TUBELIGHT      |     " + Tubelight_count + "      | " + Tubelight_price + "      |");
        System.out.println("|    4.    |        " + Product_code[3] + "       | WIRES          |     " + Wires_count + "      | " + Wires_price + "      |");
        System.out.println("|    5.    |        " + Product_code[4] + "       | OTHER          |     " + Other_count + "      | " + Other_price + "      |");
        System.out.println("|          |                |                |            |           | ");
        System.out.println("|          |                |                |            |           | ");
        System.out.println("+---------------------------------------------------------------------+");
        System.out.println("|  Total Ammount                             |          " + Total_bill_ammount + "         |");
        System.out.println("+---------------------------------------------------------------------+");

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("23DCS085 Meet K. Patel");

        sc.close();
    }
}