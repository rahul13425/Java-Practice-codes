package Inheritance;

interface intee_multiple_in {

    void show ();
}
interface I2 {
    void display();
}

class combo implements intee_multiple_in , I2
{
    public void show ()
    {
        System.out.println("1");
    }

    public  void display (){
        System.out.println("2");
    }

    public static void main(String[] args) {

        combo cm = new combo();
        cm.show();
        cm.display();
    }



}