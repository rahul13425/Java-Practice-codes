package org.example;


class rahul {
    static String name="Inheritance.rahul";

    public static void ra(){
        System.out.println("ok");
    }
    String name1 = "taaaz";



    public void hu(){
        System.out.println("kiki");
    }
}
public class code2  {
    public static void main(String[] args) {

        //accessing static method &  variables
        rahul.ra();

        System.out.println(rahul.name);

        // accessing not  static method &  variables
        rahul rj = new rahul();
        rj.hu();
        System.out.println(name.naam);


    }

}
