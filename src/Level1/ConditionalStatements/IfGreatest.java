package Level1.ConditionalStatements;

import java.util.Scanner;

public class IfGreatest {
    public static void main(String[] args) {


        // Take two int values from user and print greatest among them.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value for length: ");
        int a = in.nextInt();
        System.out.println("Enter a value for breadth: ");
        int b = in.nextInt();
        if(a>b){
            System.out.println("a is greater");
        } else if(a==b){
            System.out.println("a and b are equal");
        }else
        System.out.println("b is greater");
        in.close();
    }
}
