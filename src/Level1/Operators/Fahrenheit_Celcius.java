package Level1.Operators;

import java.util.Scanner;

public class Fahrenheit_Celcius {

    //Program to Convert Fahrenheit into Celsius
    //formula:temperature in celsius = (temperature in fahrenheit – 32)*(0.5556)
    //--------------------------------------------
    public static void main(String[] args) {
        double fahren,celcius;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Fahrenheit value : ");
        fahren = in.nextDouble();
        celcius = (fahren-32)*(0.5556);
        System.out.println("Celcius value : "+celcius);
    }
}
