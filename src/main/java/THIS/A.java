package THIS;

public class A
{

    int a =10;
}

class B extends A
{
    int a= 20;
    void show (int a)
    {
        System.out.println(a);
        System.out.println(this.a);  // this keyword is a refrence variable which is userd to refer a current class object
        System.out.println(super.a);  // super keyword is a refrence variable which is used to refer immidiate parent class object (Super.A is parent class right now )
    }
    public static void main (String [] args){

        B bb = new B();
        bb.show(30);

    }
}
