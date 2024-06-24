package THIS;

public class Fifth {


    Fifth(Demo dm)
    {
        System.out.println("constructor class");
    }

      static  class Demo {  // not clear about static here

        void mm()
        {
            Fifth ff = new Fifth(this);  // this can be used to pass an argument in the constructor call
        }

        public static void main(String[] args) {
           Demo dm = new Demo();
           dm.mm();

        }
    }
}
