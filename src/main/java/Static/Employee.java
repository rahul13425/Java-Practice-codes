package Static;

public class Employee {

    int empid;
    String name;
    String companyname = "TX";  // when the common property use all object , in that case we decalred that varibale as static , then a single copy of a varible is created and shared amongs all object at class level

    Employee(int empid, String name )    //parameterized constructor
    {
           this.empid=empid;
           this.name=name;
//           this.companyname=companyname;   // decalared as staic in class level

    }

    void display()
    {
        System.out.println(empid +" "+ name+" "+ companyname);
    }

    public static void main(String[] args) {
        Employee ee = new Employee(3700, "Rahul");
        ee.display();

        Employee ee2 = new Employee(65,"kumar");
        ee2.display();
    }
}
