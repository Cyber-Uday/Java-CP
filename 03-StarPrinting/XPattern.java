import java.util.*;

public class XPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = 0;
        while (row <= no) {
            // space
            int i = 0;
            while (i < space) {
                System.out.print("  ");
                i++;
            }
            // star;
            int j = 0;
            while (j < star) {
                System.out.print("* ");
                j++;
            }
            // next row prep
            if (row < no / 2+1) {
                space++;
            } else {
                space--;
            }
            row++;
            System.out.println();
        }
    }
}
