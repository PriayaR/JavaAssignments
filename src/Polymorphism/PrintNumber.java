package Polymorphism;

public class PrintNumber {
    /** Create a class named 'PrintNumber' to print various numbers of different data types by
    creating different methods with the same name 'println' having a parameter for each data type **/

    public static void print(int num) {
        System.out.println("___________________________");
        System.out.println("Number 1 :"+num);
        System.out.println("Its an integer value");
    }

    public static void print(float num) {
        System.out.println("___________________________");
        System.out.println("Number 2 :"+num);
        System.out.println("Its a float value");
    }

    public static void print(double num) {
        System.out.println("___________________________");
        System.out.println("Number 2 :"+num);
        System.out.println("Its a double value");
    }

//class PrintDiffDatatype {
    public static void main(String[] args) {
        //PrintNumber integer = new PrintNumber();
        print(3);
        print(4.0f);
        print(89.6879678);

    }

}
