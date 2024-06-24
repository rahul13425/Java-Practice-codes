package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadWrite {

    //* throws keyword just indacate that this method throw this kind of exception that it , it not handles the excpetion

    //throws used to declare that method might be declared an excpetion,so it is better to the caller method to provide the exception handling code, so that normal flow run can be maintained

    void readfile() throws FileNotFoundException {
        FileInputStream fi = new FileInputStream("d:/abc.txt");
    }

    void writefile() throws FileNotFoundException {
        FileOutputStream fo = new FileOutputStream("c:/jjj.test");
    }
}
    class call {

        public static void main(String[] args)  {

            ReadWrite rw = new ReadWrite();
            try {
                rw.readfile();
            } catch (FileNotFoundException e) {

                e.printStackTrace();

            }
            System.out.println("Code is successfuly run");

        }
    }
