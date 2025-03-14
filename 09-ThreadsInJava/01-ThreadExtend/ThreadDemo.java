//actually the thread is a lightwieght process which help us to achive multithreading feature 
// >> multiple threads execute the simultanously called multithreading concept..!

/*
 * Having Some methods in Thread
 * 2 diffrent way to creating the thread in java programming language..!
 * 1) using the extend thread class..!
 * 2) by implement the runnable interface..!
 * 
 * Constructor in Thread classes..!
 * Thread()
 * Thread(String name)
 * Thread(Runnable r)
 * Thread(Runnable r,String name)
 */
class ThreadX extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread X:> "+i);
        }
    }
}
class ThreadY extends Thread {
    public void run() {
        for (int j = 5; j >= 0; j--) {
            System.out.println("THREAD Y:> "+j);
        }
    }
}
class ThreadDemo {
    public static void main(String[] args) {
        ThreadX t1 = new ThreadX();
        ThreadY t2 = new ThreadY();
        t1.start();
        t2.start();
    }
}
