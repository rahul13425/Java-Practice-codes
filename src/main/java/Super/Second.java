package Super;

public class Second
{

    void V1()
    {
        System.out.println("I am in class second");
    }

   static class Next extends Second  // not clear about static
    {
        void V1()
        {
            System.out.println("i am in class next");
        }

        void shown()
        {
            V1();
            super.V1();  // super keyword can be used to call  immediate parent class method

        }

        public static void main(String[] args)
        {

            Next ob = new Next();
            ob.shown();


        }
    }

}
