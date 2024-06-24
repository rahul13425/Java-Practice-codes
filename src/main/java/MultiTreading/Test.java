package MultiTreading;

// Performing single task with single thread

public class Test  extends Thread{

    public void run(){   // declared as public   //single task
        System.out.println("Single Thread");
    }

    public static void main(String[] args) {  // JVM create first thread

        Test t = new Test();   //2 thread
        t.run();
        Test t2 = new Test();   // 3 thread
        t2.start();  //it create a different call stack for thread 
    }
}
