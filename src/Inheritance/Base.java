package Inheritance;

/**
 * 1.Write a program for creating Laptop.
 * 2.Name,Price,Processor,Ram and Hard drive should be defined in base class as constant.
 * 3.You need to inherit these functionalities in your program and Print Details.4.All the laptop should have differentname, price,processor, ram and hard drive
 */
public class Base{

public static String name;
public static double prize;
public static int processor;
public static String ram;
public static String hdd;
Base()
    {
        System.out.println("Base class");
    }
    Base(String name,double prize,int processor,String ram,String hdd)
    {
        this.name=name;
        this.prize=prize;
        this.processor=processor;
        this.ram=ram;
        this.hdd=hdd;
        System.out.println("");
    }


}
