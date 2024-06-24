package Exceptions;


// * example of customized exception using checked method (Exception class) , compile time
public class UnderAgeException extends Exception {

    UnderAgeException() {
        super("you are under age");
    }

    UnderAgeException(String msg) {
        super(msg);
    }
}
    class vote {
        public static void main(String[] args) {

            int age = 16;

            try {
                if (age < 18) {

                    throw new UnderAgeException();
                } else {
                    System.out.println("you can vote ");
                }
            } catch(UnderAgeException e)
            {
                e.printStackTrace();
            }
            System.out.println("Done");
        }
    }



