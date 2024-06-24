package org.example;

public class Animal {

    public void eat(){   ///First method

        System.out.println("I am eating");
    }

    public void run(){   ///second method

        System.out.println("i am running");
    }
    public static void main(String[] args) {

        System.out.println("print");

        Animal sheru = new Animal();  // object creation


        sheru.eat();   // call the method by using object name
        sheru.run();   // we can use the same object to call the different method as well
    }
}
