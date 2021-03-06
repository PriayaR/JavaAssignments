package Level1.LoopsConcept;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        {
            int i,j,row;
            System.out.print("Enter the no of rows : ");
            Scanner in = new Scanner(System.in);
            row = in.nextInt();
            for(i=0;i<=row;i++)
            {
                for(j=1;j<=row-i;j++)
                    System.out.print(" ");
                for(j=1;j<=2*i-1;j++)
                    System.out.print("*");
                System.out.print("\n");
            }

            for(i=row-1;i>=1;i--)
            {
                for(j=1;j<=row-i;j++)
                    System.out.print(" ");
                for(j=1;j<=2*i-1;j++)
                    System.out.print("*");
                System.out.print("\n");
            }

        }
    }
    }

