package Polymorphism;

public class Overloading {

    void show(int a, String name)
    {
        System.out.println("one");
    }

    void show( String name, int a)
    {
        System.out.println("second");
    }

    public static void main(String[] args) {

        Overloading ol = new Overloading();
        ol.show("Rahul", 20);
    }
}
