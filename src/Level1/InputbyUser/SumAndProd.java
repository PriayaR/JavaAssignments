package Level1.InputbyUser;

import java.util.Scanner;

public class SumAndProd {
    public static void main(String[] args) {

        //Write a program to take two integer inputs from user and print sum and product of them.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = in.nextInt();
        System.out.println("Enter number: ");
        int b = in.nextInt();
        System.out.println("Sum of the numbers :" +(a+b));
        System.out.println("Prod of the numbers :" +(a*b));
    }
}
