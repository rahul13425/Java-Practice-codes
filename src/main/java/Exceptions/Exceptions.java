package Exceptions;

import java.io.FileInputStream;

public class Exceptions {

// if the exception is not coming in that case catch block is not executed

    //* if try block catch the exception for eg 9 line in that case after the 9 line all the code will be skip & they move to the catch block instead.
    public static void main(String[] args)
    {

        int a=100 , b=0 , c;

        try {
            FileInputStream fs = new FileInputStream("c:/abc.test");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        try {
            c=a/b;
        }
        catch (Exception e)  // 'e' is a refrence variable name
        {
//            System.out.println(e);
            System.out.println("you can not divide by zero");
        }
        System.out.println("Run");
    }


}
