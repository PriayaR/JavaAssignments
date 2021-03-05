package Level1.Datatypes;

import java.util.Scanner;

public class Datatypes1{
    public static void main(String[] args) {

        // Created a scanner instance so that the user will be prompted to
        // enter an integer and a double value at run time
        //-----------------------------------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = scanner.nextInt();
        System.out.println("Integer value: "+a);
        System.out.println("----------------------------");
        System.out.println("Enter a number : ");
        double d = scanner.nextDouble();
        System.out.println("Double value: "+d);
        System.out.println("----------------------------");

        //Initialising a char variable and printing its value
        //System.out.println("Enter a character : ");
        //char c = 's';

        System.out.println("Enter an alphabet : ");
        char c = scanner.next().charAt(0);
        System.out.println("Character value: "+c);
        scanner.close();
    }
}
