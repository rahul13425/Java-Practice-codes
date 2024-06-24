package org.example;

abstract class vechiccle {

   abstract void show (String name);


}

class car extends vechiccle{

    void show(String name)
    {
        System.out.println("start with key");
    }
}

class scooter extends vechiccle{

    void show(String name)
    {
        System.out.println("start with kick");
    }

    public static void main(String[] args) {

        // we can't create obj with parent class "vechiccle"

        car cr = new car();
        cr.show("Inheritance.rahul");

        scooter sr = new scooter();
        sr.show("Inheritance.rahul");
    }

}
