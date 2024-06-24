package Inheritance;

public interface interf {

    void show ();

    public static final int a=10;  // all the variable in interface are "public static final"


  default void display (){  // we can create concreate method in interface with the help of 'default' & 'static' access modifier
      
  }
}

class test implements interf{

   public void show ()
    {
        System.out.println("1");
    }

    public static void main(String[] args) {

       test t = new test();
       t.show();
    }
}
