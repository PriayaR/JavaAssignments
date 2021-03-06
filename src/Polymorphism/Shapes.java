package Polymorphism;

import java.util.Scanner;

public class Shapes {

    /** Create a class to print the area of a square and a rectangle. The class has two methods with the
     same name but different number of parameters. The method for printing area of rectangle has two parameters
     which are length and breadth respectively while the other method for printing area of square has
     one parameter which is side of square. **/

    public void findArea(int num){

        int squareArea = num * num;
        System.out.println("-------------------------------------");
        System.out.println("Side of a square :" +num);
        System.out.println("Area of square is "+squareArea);
    }
    public void findArea(int l, int b){

        int rectArea = l * b;
        System.out.println("-------------------------------------");
        System.out.println("Length :"+l+ ", Breadth :"+b);
        System.out.println("Area of rectangle is "+rectArea);
    }

    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.findArea(4);
        s.findArea(2,3);
    }
}
