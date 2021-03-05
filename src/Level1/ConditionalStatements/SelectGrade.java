package Level1.ConditionalStatements;

import java.util.Scanner;

public class SelectGrade {
    public static void main(String[] args){
        /**A school has following rules for grading system:
        //a. Below 25 - F
        //b. 25 to 45 - E
        //c. 45 to 50 - D
        //d. 50 to 60 - C
        //e. 60 to 80 - B
        //f. Above 80 - A
        //Ask user to enter marks and print the corresponding grade**/

        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks :");
        int Marks = in.nextInt();
        //Char Grade;
        if(Marks<25){
            System.out.println("Grade F");
        }
        else if(Marks>=25 && Marks<=45){
            System.out.println("Grade E");
        }
        else if(Marks>=45 && Marks<=50){
            System.out.println("Grade D");
        }
        else if(Marks>=50 && Marks<=60){
            System.out.println("Grade C");
        }
        else if(Marks>=60 && Marks<=80){
            System.out.println("Grade B");
        }
        else if((Marks>80) && (Marks<=100)){
            System.out.println("Grade A");
        }
        else
            System.out.println("Enter a valid mark to know the Grade");
        in.close();
    }
}
