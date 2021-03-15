package OopsDesign;

public class EngineeringDept extends Library {
    //Eng Books
    EngineeringDept(String author, long isbn, boolean isBookRented){
        super( author, isbn, isBookRented);
    }
    //Eng furniture
    EngineeringDept(String type, String material){
        super( type, material);
    }
    //Eng staff
    EngineeringDept(String fName, String lName, int age){
        super( fName, lName, age);
    }
    public void display(){
        System.out.println("********************Welcome to Engineering department!********************");
        System.out.println("                         Includes Library and Lab                        ");
        System.out.println("**********************************************************************");
    }

}
