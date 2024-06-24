package MultiTreading;

// Performing single task with single thread

public class Testt extends Thread{

    public void run ()  //single task
    {
        System.out.println("Task 1");
    }

    public static void main(String[] args) {

        Testt tt = new Testt();   //1 thread
        tt.start();

        Testt tt2 = new Testt();  //thread
        tt2.start();
    }
}
