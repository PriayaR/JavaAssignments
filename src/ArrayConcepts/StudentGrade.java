package ArrayConcepts;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        int num, i;
        double sum = 0, avg = 0;
        int max, min;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of subjects:");
        num = in.nextInt();
        int[] NoOfMarks = new int[num];
        System.out.println("Enter marks");

        //Storing the marks in an array and finding the sum of the marks
        for(i=0; i<num; i++)
        {
            NoOfMarks[i]=in.nextInt();
            sum=sum+NoOfMarks[i];
        }

        //Sorting the array to find the largest and the smallest number in an array
        Arrays.sort(NoOfMarks);
        System.out.println("Sorted array : "+Arrays.toString(NoOfMarks));
        max = NoOfMarks[NoOfMarks.length-1];
        min = NoOfMarks[0];

        //Finding the average of the marks and Printing the values for sum,average,maximum and the minimum.
        System.out.println("---------------------");
        System.out.println("Sum : " +sum);
        System.out.println("Average of the marks is "+(sum/num));
        System.out.println("---------------------");
        System.out.println("Maximum marks : "+max);
        System.out.println("Maximum marks : "+min);


    }
}
