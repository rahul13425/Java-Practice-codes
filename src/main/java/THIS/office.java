package THIS;

public class office {

    String name;
    int id;

    office (String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {

        office ofc1 = new office("Rahul", 3700);
        office ofc2 = new office("kumar", 0);
        System.out.println(ofc1.name + " "+ ofc1.id);
        System.out.println(ofc2.name + " " +  ofc2.id);
    }
}
