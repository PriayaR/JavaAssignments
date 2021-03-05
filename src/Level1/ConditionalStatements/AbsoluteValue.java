package Level1.ConditionalStatements;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        /**----------------------------------------------------------------------------
         # Absolute value describes the distance from zero that a number is on the number line,
           without considering direction.
         # The absolute value of a number is never negative.
         # For any positive number,the absolute value is the number itself and
         # For any negative number,the absolute value is (-1) multiplied by the negative number.
        -------------------------------------------------------------------------------**/

        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        num = scanner.nextInt();
        if(num<0)
        {
            num = num * (-1);
        }
        System.out.println("Absolute value "+num);
    }
}
