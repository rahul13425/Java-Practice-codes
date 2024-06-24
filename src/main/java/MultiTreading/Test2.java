package MultiTreading;

public class Test2 implements Runnable{


    // perform task using Runnable class
    @Override
    public void run() {   //single task
        System.out.println("Task");

    }

    public static void main(String[] args) {

        // create object for test class
        Test2 t2= new Test2();

        // create object for thread class
        Thread th = new Thread(t2);  // insert the t2 parm from Constructor.Test2 object

        th.start();  //start the thread or call
//        t2.run();
    }
}
