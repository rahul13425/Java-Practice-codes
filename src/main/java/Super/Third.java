package Super;

public class Third {


    // can be used to call immediate parent class constructor
    Third ()
    {
        System.out.println("I am in third ");

    }}

    class Tertiary extends Third{

        Tertiary()
        {
            // use in case of constructor
             // compiler automatically insert and call the super keyword even if not create manually.
            System.out.println("I am in Tertiary");
        }

        public static void main(String[] args) {


           Third tr  = new Third();
            Tertiary tt  = new Tertiary();



    }
}
