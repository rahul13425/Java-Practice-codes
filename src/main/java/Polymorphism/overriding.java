package Polymorphism;

public class overriding {

    // covariant return type
    Object  show(String name, int a)   // Object is a parent class
    {
        System.out.println("1");
        return null;   // we have to add this because we use object return type
    }
}

class over extends overriding{

    String show (String name, int a)  // String is a child class for object so that is why we can use here in the help of covarinat return type
    {                                   // we can also use Object return type as well
        System.out.println("2");
        return null;     // we have to add this because we use String return type
    }

    public static void main(String[] args) {

        overriding or = new overriding();
        or.show("Inheritance.rahul", 10);   // this object varibale only call overrding class

        over ov = new over();
        ov.show("Kumar",2 );  //This object variable call the Polymorphism.over class

        // we can call the different class as well but using super keyword
    }




}
