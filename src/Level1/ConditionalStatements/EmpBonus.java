package Level1.ConditionalStatements;

import java.util.Scanner;

public class EmpBonus {
    public static void main(String[] args) {

        //A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
        //------------------------------------------------------------------------------------
        //Print the net bonus amount, taking Salary & service as Input

        double sal;
        int years_of_service;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Salary : ");
        sal=in.nextDouble();
        System.out.println("Enter No: of years of service : ");
        years_of_service=in.nextInt();
        if(years_of_service>=5){
            double bonus = (sal+(sal*0.05));
            System.out.println("Employee gets extra 5% bonus "+bonus);
        }else
        {
            System.out.println("Employee should complete a minimum of 5 years to be eligible for a bonus");
        }
        in.close();

    }

}
