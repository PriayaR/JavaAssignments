package Polymorphism;

class Degree {
    public void getDegree() {
        System.out.println("I got a degree");
    }
}
class UnderGraduate extends Degree{
    public void getDegree(){
        System.out.println("I am an Undergraduate");
    }
}
class PostGraduate extends Degree {
    public void getDegree() {
        System.out.println("I am a Postgraduate");
    }
}
class FindDegree{
public static void main(String[] args) {

    /** Created object for the ug and the pg child classes which are being referenced to a parent class variable,
        hence preference is given to the overridden child class method while method calling at run time **/
        Degree deg = new UnderGraduate();
        deg.getDegree();

        Degree deg1 = new PostGraduate();
        deg1.getDegree();
        System.out.println("_____________________________________");

        //Created objects for the respective classes
        Degree deg2 = new Degree();
        deg2.getDegree();

        UnderGraduate ug = new UnderGraduate();
        ug.getDegree();

        PostGraduate pg = new PostGraduate();
        pg.getDegree();
    }
}