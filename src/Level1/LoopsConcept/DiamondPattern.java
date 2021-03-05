package Level1.LoopsConcept;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        int i, j, len=5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no: of rows");
        len = scanner.nextInt();
        for(i=0;i<len;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
