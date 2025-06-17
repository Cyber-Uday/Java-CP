import java.util.*;

//when constructor takes arguments then it is called as paratmeterized constructor
public class ParameterizedConstructor {
    ParameterizedConstructor(int a, int b) {
        System.out.println("ADD OF a and b is:> " + (a + b));
    }

    public static void main(String[] args) {
        ParameterizedConstructor p = new ParameterizedConstructor(102, 8);
    }
}
