package Exceptions;

import java.util.Scanner;

   //example of customized exception using unchecked method (Using runtime exception class)

public class YoungerAgeException extends RuntimeException {

    YoungerAgeException(String msg){

        super(msg);
    }
}
class voting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age ");

        int age = sc.nextInt();

        try {
            if (age<18){
                throw new  YoungerAgeException("You are not eligible for voting");
            }
            else {
                System.out.println("you are eligible");
            }
        }
        catch (YoungerAgeException Ye)
        {
            Ye.printStackTrace();
        }

        finally {
            System.out.println("Done");
        }
    }
}
