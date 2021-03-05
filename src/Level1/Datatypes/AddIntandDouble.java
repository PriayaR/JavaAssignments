package Level1.Datatypes;

public class AddIntandDouble {
    public static void main(String[] args) {
        //To add an integer variable with a double variable

        int a = 5;
        double b = 6.2, sum;

        //Converting int into a double value before performing addition
        double c = a;
        sum = b+c;
        System.out.println("Integer " +a+" is converted into double: " +c);
        System.out.println("Sum: "+sum);
    }
}
