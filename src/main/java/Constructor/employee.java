package Constructor;

public class employee {

    // using constructor we initialize object

    String name;
    int emp_id;

    employee (String name, int emp_id)   //constructor create
    {
        this.name = name;
        this.emp_id= emp_id;
    }

    public void display()
    {
        System.out.println(name);
        System.out.println(emp_id);

    }

    public static void main(String[] args) {
        employee ep = new employee("Inheritance.rahul",3700);


        ep.display();
    }


}
