package Static;


// static keyword is the non  accesss modifier
public class Test {

    static  int a =101;

}
class Demo {

    public static void main(String[] args) {
        System.out.println(Test.a);  // static variable belong to the class not object (we used here class refernece to call)
    }
}
