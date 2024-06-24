package THIS;

public class First_use {

    int i ;
    void value (int i)

    {
        this.i = i;  //this keyword can be used to refer a current class instance variable
    }

    void show ()
    {
        System.out.println(i);
    }

    public static void main(String[] args) {

        First_use fs = new First_use();
        fs.value(100);
        fs.show();
    }
}
