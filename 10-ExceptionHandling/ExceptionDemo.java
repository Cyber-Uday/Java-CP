import java.util.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        // Divide By Zero Exception>>
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        System.out.println("Enter the 2 : number to divide:> ");
        int num2 = sc.nextInt();
        try {
            if (no == 0 || num2 == 0) {
                throw new Exception("Divide By Zero Exception ");
            } else {
                System.out.println("THE DIVISION Is:" + (no / num2));
            }
        } catch (Exception ee) {
            System.out.println("The Excetion Occur is:> " + ee.getMessage());
        }
    }
}
