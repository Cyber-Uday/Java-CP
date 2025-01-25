import java.util.*;

class  Addition {
    int a, b;
    Scanner sc = new Scanner(System.in);
    void display_add() {
        System.out.println("ENter the first Number");
        a = sc.nextInt();
        System.out.println("Enter the 2nd Number:> ");
        b = sc.nextInt();
        System.out.println("Addition is :> " + (a + b));
    }
}
public class SingleInheritance extends Addition {
    public static void main(String[] args) {
        SingleInheritance si = new SingleInheritance();
        si.display_add();
    }
}
