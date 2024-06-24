package Inheritance;

public interface rahul {

    void ishrar();

}
class ramzan implements rahul{

    public void ishrar()

    {
        System.out.println("okok");
    }

    public static void main(String[] args) {

        ramzan rz = new ramzan();

        rz.ishrar();
    }
}
