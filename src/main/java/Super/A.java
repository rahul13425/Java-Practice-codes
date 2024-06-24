package Super;

public class A {

    void showA()
    {
        System.out.println("ShowA");
    }
}

class B extends A
{

    void showB()
    {
        System.out.println("Show Super.B");
    }

    public static void main(String[] args) {

      A bb = new A();
        bb.showA();

        //bb.showB();  // not call



    }
}

