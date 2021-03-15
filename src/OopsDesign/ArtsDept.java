package OopsDesign;

public class ArtsDept extends Library {
    ArtsDept(String author, long isbn, boolean isBookRented){
        super( author, isbn, isBookRented);
    }

    ArtsDept(String type, String material){
        super( type, material);
    }
    ArtsDept(String fName, String lName, int age){
        super(fName,lName,age);
    }
    public void display(){
        System.out.println("********************Welcome to Arts department!********************");
        System.out.println("                    Includes Library and Music                      ");
        System.out.println("**********************************************************************");
    }

}
