package Constructor;

public class Animal3 {

    // Initialize object by using method

    String color;
    int age;

    public void first_method(String a, int b){

        color = a;
        age= b;
    }

    public void display()
    {
        System.out.println(color+" "+age);
    }

    public static void main(String[] args) {
        Animal3 anm= new Animal3();
        anm.first_method("black", 12);
        anm.display();
    }
}
