package Static;

public class Testing {

    static void show()
    {
        System.out.println("2");
    }

    static void display()
    {
        show();  // A static method can call only other static method & can't call a non-static method
        System.out.println("3");
    }

    public static void main(String[] args) {

        display();

    }
}
