package OopsDesign;

public class College {

    public static void main(String[] args) {

        ArtsDept book1 = new ArtsDept("Jeff Tweedy", 111, true);
        ArtsDept book2 = new ArtsDept("Ani DiFranco",222, false);
        ArtsDept book3 = new ArtsDept("Dessa", 333, true);
        ArtsDept book4 = new ArtsDept("Ryan H.Walsh", 444, false);
        ArtsDept furn1 = new ArtsDept("Chair","Wood");
        ArtsDept furn2 = new ArtsDept("Rack","Iron");
        ArtsDept furn3 = new ArtsDept("Chair","Wood");
        ArtsDept staff1 = new ArtsDept("Anu", "Pallavi",30);
        ArtsDept staff2 = new ArtsDept("Priyanka","Haseen",25);
        book1.display();

        EngineeringDept book5 = new EngineeringDept("Gayle Laakmann McDowell",6665, true);
        EngineeringDept book6 = new EngineeringDept("Max Tegmark",1234, false);
        EngineeringDept book7 = new EngineeringDept("Henry Petroski",7778, true);
        EngineeringDept furn4 = new EngineeringDept("Chair","Iron");
        EngineeringDept furn5 = new EngineeringDept("Table","Wood");
        EngineeringDept staff3 = new EngineeringDept("Shilpa", "Shetti",36);
        EngineeringDept staff4 = new EngineeringDept("Jabeen", "Akthar",30);
        book5.display();

        System.out.println("Number of books available in Engineering and Arts department : "+book1.getNumberOfBooks());
        System.out.println("Number of books rented : "+book1.getNumberOfBooksRented());
        System.out.println("Number of chairs : "+furn1.getNumberOfChairs());
        System.out.println("Number of staffs working in college : "+staff1.getNumberOfStaff());
        staff1.getEldestStaffName();
    }
}

