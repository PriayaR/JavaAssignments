package Level1.ConditionalStatements;

import java.util.Scanner;

public class CalAttendance_with_Medicalcause {

    /** Given:A student will not be allowed to sit in exam if his/her attendance is less than 75%
    # To allow student to sit if he/she has medical cause.
    # Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly**/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of classes held: ");
        int class_held = scanner.nextInt();
        System.out.println("Number of classes attended: ");
        int class_attended = scanner.nextInt();
        float percentage = ((class_attended * 100) / class_held);
        if (percentage < 75) {
            System.out.println("----------------------------------------------");
            System.out.println("You have less than 75% of attendence");
            System.out.println("----------------------------------------------");
            System.out.println("Do you have any medical reasons : ");
            System.out.println("Say 'YES' or 'NO'");
            System.out.println("----------------------------------------------");
            String choice = scanner.next();
            switch (choice) {
                case "YES":
                    System.out.println("You are allowed to sit in the exam");
                    break;
                case "NO":
                    System.out.println("you are not allowed to sit in the exam");
                default :
                    System.out.println("ENTER A VALID RESPONSE");

            }
        }
        else
            {
                System.out.println("----------------------------------------------------");
                System.out.println("You have an attendence percentage of " + percentage + "%");
                System.out.println("Eligible for the exam");
            }
        }
    }

