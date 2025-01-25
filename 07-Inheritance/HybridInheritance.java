
//combination of 2 or more inheritance called the Hybrid Inheritance..!
import java.util.*;

class Subtraction {
    Subtraction(int num1, int num2) {
        System.out.println("THIS IS SUBTRACTION " + (num1 - num2));
    }
}

class Addtion extends Subtraction {
    Addtion(int num1, int num2) {
        super(num1, num2);
        System.out.println("THIS IS AdDITION CLASS" + (num1 + num2));
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Addtion add1=new Addtion(num1, num2);
        }
}
