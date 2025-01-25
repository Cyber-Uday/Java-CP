//here we are going to explore the priority of the thread in java...!
/* 
 * 3 types of prioroty will be tehre ..!
 * 1) MIN_PRIORITY--1
 * 2) NORM_PRIORITY--5
 * 3) MAX_PRIORITY--10
 * 
 * default priority of a thread is 5 which is normal priority..!
 * 
 * using getPriority() method we can retrive the priority of the thread.
 */
class ThreadX extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("THREAD X:> "+i);
        }
    }
}
class ThreadY extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("THREAD Y:> "+i);
        }
    }
}
class ThreadZ extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("THREAD Z:> "+i);
        }
    }
}
public class ThreadPriorityDemo {
    public static void main(String[] args) {
    ThreadX tx=new ThreadX();
    ThreadY ty=new ThreadY();
    ThreadZ tz=new ThreadZ();

    System.out.println("THE PRIORITY OF THREAD BEFORE SET:> "+tz.getPriority());

    tx.setPriority(Thread.MIN_PRIORITY);
    ty.setPriority(Thread.NORM_PRIORITY);
    tz.setPriority(Thread.MAX_PRIORITY);

    tx.start();
    ty.start();
    tz.start();

    System.out.println("THE PRIORITY OF THREAD AFTER SET:> "+tz.getPriority());
}
}
