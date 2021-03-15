package OopsDesign;

public class Library {
    //Book details
    static int countOfBooks, countOfBooksRented, countOfChairs, numberOfStaff;
    String author;
    long isbn;
    boolean isBookRented;
    //Furniture details
    String type,material;
    //Staff details
    int age;
    String fName,lName;
    //Eldest staff details
    static int eldestAge;
    static String eldestFName, eldestLName;

    public Library(){
        System.out.println("Library includes books,furniture and staffs");
    }

    public Library(String author, long isbn, boolean isBookRented){

        this.author = author;
        this.isbn = isbn;
        this.isBookRented = isBookRented;
        countOfBooks++;
        if(isBookRented){
            countOfBooksRented++;
        }
    }
    public Library (String type, String material){

        this.type = type;
        this.material = material;
        if(type.equalsIgnoreCase("Chair")){
            countOfChairs++;
        }
    }
    public Library(String fName, String lName, int age){

        this.fName = fName;
        this.lName = lName;
        this.age = age;
        numberOfStaff++;
        if (eldestAge < age){
            eldestAge = age;
            eldestFName = fName;
            eldestLName = lName;
        }

    }

    public int getNumberOfBooks() {
        return this.countOfBooks;
    }
    public int getNumberOfBooksRented() {
        return this.countOfBooksRented;
    }
    public int getNumberOfChairs() {
        return this.countOfChairs;
    }
    public int getNumberOfStaff() {
        return this.numberOfStaff;
    }

    public void getEldestStaffName() {
        System.out.println("Eldest member working in library : "+eldestFName+" "+eldestLName);
    }

}
