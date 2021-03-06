package Inheritance;

public class CreatingALaptop extends LaptopBase {

    public CreatingALaptop(String Name, double Price, String Processor, String RAM, String HDD) {
        super(Name, Price, Processor, RAM, HDD);
    }

    public static void main(String[] args) {
        CreatingALaptop laptop = new CreatingALaptop("Hp", 1000, "i3", "2GB", "500GB");
        laptop.printLaptopDetails();
        System.out.println("----------------------------------------");
        CreatingALaptop laptop1 = new CreatingALaptop("Dell", 1500, "i5", "4GB", "1TB");
        laptop1.printLaptopDetails();
        System.out.println("----------------------------------------");
        CreatingALaptop laptop2 = new CreatingALaptop("Sony", 2000, "i9", "8GB", "1TB");
        laptop2.printLaptopDetails();
    }
}
