package Level1.LoopsConcept;

import java.util.Scanner;

// To calculate average using loops concept

public class Average {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum=0;
        int avg;
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<array.length; i++){
        System.out.println("Enter the "+(i+1)+ " number");
        array[i] = scanner.nextInt();
        sum = sum+array[i];
        }
        avg = sum/ array.length;
        System.out.println("-----------------------------------");
        System.out.println("The sum is "+sum);
        System.out.println("The average is "+avg);
    }
}
