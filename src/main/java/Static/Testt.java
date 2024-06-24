package Static;

public class Testt {

    static void show() {
        System.out.println("2");
    }
}
    class xyzz{


    static void disss()
    {
        System.out.println("44");
    }

        public static void main(String[] args)
        {
            Testt.show();  // we can directly call the static method no  need of objection creation or we can use the class name to call the method with in class only
             xyzz.disss();  // call other class method as well but by using classname.methodname();
        }

    }




