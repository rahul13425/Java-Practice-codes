package Access_modifier_priority;

public class Testing {

     protected void show(int a , String name)  // protected access modifier is less priority than public
    {
        System.out.println("1");
    }
}

class TX  extends  Testing{

    public void show(int a , String name) throws ArithmeticException   // If parent class not through any exception in that case child class through unchecked exceptions
    {
        System.out.println("2");


    }

    public static void main(String[] args) {   // Child class access modifier always greater than the parent class

        Testing ts = new Testing();
        ts.show(10, "kumar");

        TX x = new TX();
        x.show(23, "okok");

    }


}
