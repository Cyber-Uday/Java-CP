import java.util.*;

public class PointTriangle {
    public static void main(String[] args) {
        // require things..!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int space = 0;
        int star = num;
        int row = 1;// 1 to n
        while (row <= num) {
            // space
            int s = 0;
            while (s < space) {
                System.out.print("  ");
                s++;
            }
            // star
            int i = 0;
            while (i < star * 2 - 1) {
                System.out.print("* ");
                i++;
            }
            // next row prep
            row++;
            System.out.println();
            star--;
            space++;
        }
    }
}
