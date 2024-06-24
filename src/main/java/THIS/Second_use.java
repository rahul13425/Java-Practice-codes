package THIS;

public class Second_use {

    //this keyword can be used to call current class method (implicity)

    void display ()
    {
        System.out.println("Rahul is here ");
    }

    void show ()
    {
        this.display();   //If we not add this. here then compiler automatically add this here
    }

    public static void main(String[] args) {
        Second_use su = new Second_use();
        su.show();
    }
}
