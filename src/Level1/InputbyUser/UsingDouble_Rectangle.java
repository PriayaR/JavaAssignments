package Level1.InputbyUser;

import java.util.Scanner;

public class UsingDouble_Rectangle {
    public static void main(String[] args) {
        //Ask user to give two double input for length and breadth of a rectangle and
        // print area type casted to int.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value for length: ");
        double l = in.nextDouble();
        System.out.println("Enter a value for breadth: ");
        double b = in.nextDouble();
        double area = l * b;
        System.out.println("Area of rectangle : "+(int)area);


    }
}
