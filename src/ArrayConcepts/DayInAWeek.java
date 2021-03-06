package ArrayConcepts;

import java.util.Scanner;

public class DayInAWeek {
    public static void main(String[] args) {
        String[] Weekdays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        try{
        while(flag){
            System.out.println("Enter a number between 1 and 7 :");
            int day = in.nextInt();
            System.out.println("--------------------------------------");
            for (int i = 0; i < Weekdays.length; i++) {
                System.out.println(Weekdays[day - 1]);
                flag=false;
                break;
            }

        }
        in.close();
    }
        catch(Exception e) {
            System.out.println("-------------------------------------------");
            System.out.println("Please input a number between 1 and 7");
            System.out.println("Array-Index-Out-of-bound-exception");
        }
        }

}
