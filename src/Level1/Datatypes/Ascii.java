package Level1.Datatypes;

public class Ascii{
    public static void main(String[] args) {
        int a=3,add;

        //Fetching the ascii value of a character 'd' and adding 3 to it
        int c1= 'd';
        add = a+c1;

        //Converting ascii value to its corresponding character
        char c= (char)add;
        //System.out.println((char) 65);
        System.out.println("ASCII value of d : "+c1);
        System.out.println("Result of adding 3 to ASCII value of 'd' : "+add);
        System.out.println(c + " is the corresponding character of the ascii " +add);


    }
}
