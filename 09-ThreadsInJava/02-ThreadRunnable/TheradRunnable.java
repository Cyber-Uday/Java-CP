//here we are going to implemnet the thread using Runnable Interface..!

class RunnableX implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("RUNNABLE X:> " + i);
        }
    }
}

class RunnableY implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("RUNNABLE Y :> " + i);
        }
    }
}

public class TheradRunnable {
    public static void main(String[] args) {
        RunnableX rx = new RunnableX();
        RunnableY ry = new RunnableY();
        rx.run();
        ry.run();
    }
}
