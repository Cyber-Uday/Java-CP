import java.util.Scanner;

public class RightAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length you want to create the right angle triangle:> ");
        int get_user_input = sc.nextInt();
        int row = 1;
        int star = 1;
        while (row <= get_user_input) {
            int i = 0;
            while (i < star) {
                System.out.print("* ");
                i++;
            }
            star++;
            row++;
            System.out.println();
        }
    }
}
