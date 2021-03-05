package Level1.ConditionalStatements;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        //Problem statement : Take input of age of 3 people by user and determine oldest and youngest among them
        /** Input:
         Enter the age of user1:
         10
         Enter the age of the user2:
         12
         Enter the age of user3:
         3
         ------------------------------------
         Output:
         User2 is the oldest person
         User3 is the youngest one **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age of user1: ");
        int age_1 = scanner.nextInt();

        System.out.println("Enter the age of the user2: ");
        int age_2 = scanner.nextInt();

        System.out.println("Enter the age of user3: ");
        int age_3 = scanner.nextInt();

        if((age_1>age_2)&&(age_1>age_3))
        {
            System.out.println("------------------------------------");
            System.out.println("User1 is the oldest person");
            if((age_2>age_3)&&(age_2!=age_3)){
                System.out.println("User3 is the youngest person");
            }else{
                System.out.println("User2 and user3 have the same age");
            }
        }
        else if((age_1<age_2)&&(age_1<age_3))
        {
            System.out.println("------------------------------------");
            System.out.println("User1 is the youngest person");
            if((age_2<age_3)&&(age_2!=age_3)){
                System.out.println("User2 is the oldest one");
            }else{
                System.out.println("User2 and user3 have the same age");
            }
        }
        else if((age_2>age_1)&&(age_2>age_3))
        {
            System.out.println("------------------------------------");
            System.out.println("User2 is the oldest person");
            if((age_1>age_3)&&(age_1!=age_3)){
                System.out.println("User3 is the youngest one");
            }else{
                System.out.println("User1 and user3 have the same age");
            }
        }
        else if((age_2<age_1)&&(age_2<age_3))
        {
            System.out.println("------------------------------------");
            System.out.println("User2 is the youngest person");
            if((age_1<age_3)&&(age_1!=age_3)){
                System.out.println("User3 is the oldest one");
            }else{
                System.out.println("User1 and user3 have the same age");
            }
        }
        else if((age_3>age_1)&&(age_3>age_2))
        {
            System.out.println("------------------------------------");
            System.out.println("User3 is the oldest person");
            if((age_1>age_2)&&(age_1!=age_2)){
                System.out.println("User2 is the youngest one");
            }else{
                System.out.println("User1 and user2 have the same age");
            }
        }
        else if((age_3<age_1)&&(age_3<age_2))
        {
            System.out.println("------------------------------------");
            System.out.println("User3 is the youngest person");
            if((age_1<age_2)&&(age_1!=age_2)){
                System.out.println("User2 is the oldest one");
            }else{
                System.out.println("User1 and user2 have the same age");
            }
        }


    }
}
