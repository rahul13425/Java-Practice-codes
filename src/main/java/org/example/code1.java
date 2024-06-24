package org.example;


class name {
    static  String naam = "Ishrar";
    void rahul (){

        System.out.println("Inheritance.rahul method");
    }
}

class role{
    void TE (){

        System.out.println("TE method");
    }
}
public class code1 {

    public static void main(String[] args) {
        System.out.println("main method ");

        name nm= new name();
        role rl = new role();

        nm.rahul();
        rl.TE();
        throw new RuntimeException("error");

    }




}
