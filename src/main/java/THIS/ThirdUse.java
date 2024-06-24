package THIS;

public class ThirdUse
{

    //this() can be used to call current class constructor

    ThirdUse()
    {
        this(10);    /// this can be use for call the parametrized constructor
        System.out.println("Default constructor");
    }

    ThirdUse(int a)
    {
        //this();  use to call default constructor
        System.out.println("Parameterized constructor");
    }

    public static void main(String[] args) {

        ThirdUse tu = new ThirdUse();
    }

}
