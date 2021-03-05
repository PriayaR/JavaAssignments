package Level1.ConditionalStatements;

import java.util.Scanner;

public class ifSquareOrRectangle {
    public static void main(String[] args) {

        //Take values of length and breadth of a rectangle from user and check if it is square or not.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value for length: ");
        int l = in.nextInt();
        System.out.println("Enter a value for breadth: ");
        int b = in.nextInt();
        if (l == b) {
            System.out.println("Its a Square");
        } else {
            System.out.println("Its a Rectangle");
        }
        in.close();
    }
}
