package Level1.LoopsConcept;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
            int num1, num2;
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter first number:");
            num1 = scanner.nextInt();

            System.out.print("Enter second number:");
            num2 = scanner.nextInt();

            //closing the scanner to avoid memory leaks
            scanner.close();

            while (num1 != num2) {
                if(num1 > num2)
                    num1 = num1 - num2;
                else
                    num2 = num2 - num1;
            }

            //displaying the result
            System.out.println("GCD of given numbers is: "+num2);
        }
    }

