import java.util.*;

public class ZPattern {
    public static void main(String[] args) {
        // declare imp think
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = sc.nextInt();
        int row = 1;
        int space = num - 1;
        int star = num;
        while (row <= num) {
            // star
            if (row == 1 || row == num) {
                int i = 0;
                while (i < star) {
                    System.out.print("* ");
                    i++;
                }
            } else {
                int j = 0;
                while (j < space) {
                    System.out.print("  ");
                    j++;
                }
                System.out.print("* ");
            }
            // next row prep
            space--;
            row++;
            System.out.println();
        }
    }
}
