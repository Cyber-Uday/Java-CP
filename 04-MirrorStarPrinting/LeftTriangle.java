import java.util.*;

public class LeftTriangle {
    // left trainge
    public static void main(String[] args) {
        int star = 1;
        int row = 1;
        int no = 5;
        int space = no - 1;
        while (row <= no) {
            // space
            int i = 0;
            while (i < space) {
                System.out.print("  ");
                i++;
            }
            // star
            int j = 0;
            while (j < star) {
                System.out.print("* ");
                j++;
            }
            // next row prep
            row++;
            star++;
            space--;
            System.out.println();
        }
    }
}
