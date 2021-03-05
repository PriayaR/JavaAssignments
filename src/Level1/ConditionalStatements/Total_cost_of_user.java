package Level1.ConditionalStatements;

import java.util.Scanner;

public class Total_cost_of_user {
    public static void main(String[] args) {

        /**-------------------------------------------------------------------------------
         # A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
         # Ask user for quantity
         # Suppose,one unit will cost 100.
         # Judge and print total cost for user.
         -------------------------------------------------------------------------------**/

        int qty;
        double cost_per_unit = 100;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a quantity: ");
        qty = in.nextInt();
        double cost = qty * cost_per_unit;
        if(cost>1000){
            double TotCost = cost -(cost * 0.1);
            System.out.println("----------------------------------");
            System.out.println("Quantity ordered :"+qty);
            System.out.println("You get a discount of 10%");
            System.out.println("Total cost would be "+TotCost);
            System.out.println("----------------------------------");
        }else
        {
            System.out.println("*--------------*------------------*");
            System.out.println("Add more to avail a discount");
        }
        in.close();
    }
}
