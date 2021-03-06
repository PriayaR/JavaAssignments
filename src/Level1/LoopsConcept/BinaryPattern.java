package Level1.LoopsConcept;

import java.util.Scanner;

public class BinaryPattern {
    public static void main(String[] args) {
        int i, j, x, y, rows;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        rows = scan.nextInt();
        for (i = rows; i >= 1; i--) {
            if (i % 2 == 0) {
                x = 1;
                y = 0;
            } else {
                x = 0;
                y = 1;
            }
            for (j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(x);
                } else {
                    System.out.print(y);
                }
            }
            System.out.println("");
            scan.close();
        }
    }
}

