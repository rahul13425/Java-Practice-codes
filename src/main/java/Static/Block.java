package Static;
   // without creating main method we can run the code by crating static block , But JDK version should be equal or lesser than 1.6
public class Block {

    static
    {
        System.out.println("print without main method"); // print static method first
    }

       public static void main(String[] args) {
           System.out.println("I am in main method ");

           //static method call automatically when the class is loaded without calling anywhere
    }
}
