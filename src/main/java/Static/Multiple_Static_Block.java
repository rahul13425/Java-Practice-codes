package Static;

public class Multiple_Static_Block {
 // All sttaic block run Top to bottom & main method run at last
    static
    {
        System.out.println("Method one");
    }

    static
    {
        System.out.println(" A Method Second");
    }
    static
    {
        System.out.println("Method Third");
    }

    public static void main(String[] args) {
      System.out.println("I am in main method");
    }
    static
    {
        System.out.println("Method fourth");
    }
}
