package Inheritance;

/**-------------------------------------------------------------------------------------
 * 1.Write a program for creating Laptop.
 * 2.Name,Price,Processor,Ram and Hard drive should be defined in base class as constant.
 * 3.You need to inherit these functionalities in your program and Print Details.
 * 4.All the laptop should have different name, price,processor, ram and hard drive
 --------------------------------------------------------------------------------------**/

public class LaptopBase{

public final String Name;
public final double Price;
public final String Processor;
public final String RAM;
public final String HDD;

public LaptopBase(String Name, double Price, String Processor, String RAM, String HDD)
    {
        this.Name = Name;
        this.Price = Price;
        this.Processor = Processor;
        this.RAM = RAM;
        this.HDD = HDD;

    }
    public void printLaptopDetails(){

        System.out.println("Laptop details");
        System.out.println("**********************************");
        System.out.println("Name : "+Name);
        System.out.println("Price : "+Price);
        System.out.println("Processor : "+Processor);
        System.out.println("RAM : "+RAM);
        System.out.println("HDD : "+HDD);
    }
}


