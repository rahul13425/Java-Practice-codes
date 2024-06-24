package Exceptions;

public class Test {

    public static void main(String[] args) {

        int a = 22 , b= 0 , c;

      // put risky code i try block
        try {
            c= a/b;
        }
        // catch block is the alternate way to handle the excpetion of try block.
        catch (ArithmeticException ae)
        {
            // 1. most use way to print exceptions

            ae.printStackTrace();  // ea is refrence vaiable of exception

            // * object exception provides all the three major points
//java.lang.ArithmeticException:                                   1.Exception name
// / by zero                                                       2. Decription
//	at Exceptions.Constructor.Test.main(Constructor.Test.java:11)  3. Stack trace (line of code where exception occur)

            // Second way to print exception

            //System.out.println(ae);
           // System.out.println(ae.toString());

            // only provide:- 1. exception name & 2. Description

            // Third way to print exception
            //System.out.println(ae.getMessage());

            // only provide : by zero   1. Decription
        }
    }
}
