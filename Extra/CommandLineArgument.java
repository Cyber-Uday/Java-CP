import java.util.*;

public class CommandLineArgument {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("THIS IS THE Command Line Argument Proejct..!");
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER FOR ADD:> ");
        a=sc.nextInt();
        System.out.println("ENTER THE 2nd Number for ADD:> ");
        b=sc.nextInt();
        System.out.println("ADDITION IS :> "+(a+b));
    }
}
