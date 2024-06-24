package Synchronized_Strictfp;

public class Teest {

   synchronized void show() // synchronized & strictfp keyword also be override without any error
    {
        System.out.println("1");
    }
}

class Tesst extends Teest {



    void show ()
    {
        super.show();   //By using super keyword, we can call the parent class method by child class object.
        System.out.println("2");
    }

    public static void main(String[] args) {

        Teest te = new Tesst();
        te.show();
    }

}
