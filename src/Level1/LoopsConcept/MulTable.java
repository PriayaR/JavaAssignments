package Level1.LoopsConcept;

import java.util.Scanner;

public class MulTable {

    // method to print the table
    public void printMultiplicationTable(int number) {

        System.out.println("Multiplication table of " + number + " is ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

    public static void main(String[] args) {
        MulTable mul1 = new MulTable();
        MulTable mul2 = new MulTable();
        MulTable mul3 = new MulTable();

        mul1.printMultiplicationTable(24);
        mul2.printMultiplicationTable(29);
        mul3.printMultiplicationTable(50);
        }

    }
