package MultiTreading;

// Performing multiple  task with multiple threads

public class Teest extends Thread{

    public void run()
    {
        System.out.println("Task1");
    }

}

class Teest2 extends Thread{
    public void run()
    {
        System.out.println("Task2");
    }

    public static void main(String[] args) {
        Teest t = new Teest();
        t.start();

        Teest2 te2 = new Teest2();
        te2.start();
    }


}
