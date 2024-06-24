package org.example;

public class Animal2 {

    // Initialize object by using reference variable

    String color;
    int age;

    public static void main(String[] args) {

        Animal2 an = new Animal2();

        an.color = "Black";
        an.age = 10;

        System.out.println("colour:" +an.color + " " + "age:"+an.age);
    }
}
