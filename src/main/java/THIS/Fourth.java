package THIS;

public class Fourth {

    void m1(Fourth fr)  // fourth pass a refrence variable of the current class
    {
        System.out.println("I am in M1");
    }

    void m2()
    {
        m1(this);  // this keyword can be used to pass an argument in the method call
    }

    public static void main(String[] args) {
        Fourth ft = new Fourth();
        ft.m2();
    }
}
