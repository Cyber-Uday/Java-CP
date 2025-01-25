import java.util.*;
public class AllTypesOfCommandLineArgument {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("THIS IS AN INTEGER CONSTANT :> ");
        a=sc.nextInt();
        System.out.println("This is an Float: ");
        float b=sc.nextFloat();
        System.out.println("Addition oF Integer and Float :> "+(a+b));
    }
}
