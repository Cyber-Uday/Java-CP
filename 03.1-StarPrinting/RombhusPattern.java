import java.util.*;

public class RombhusPattern {
    public static void main(String[] args) {
        // define require things.>>
        int no = 5;
        int row = 1;
        int star = 5;
        int space1 = no - 1;
        int space2 = no - 2;
        while (row <= no) {
            // space1
            int s1 = 0;
            while (s1 < space1) {
                System.out.print("  ");
                s1++;
            }
            // star
            if (row == 1 || row == no) {
                int i = 0;
                while (i < star) {
                    System.out.print("* ");
                    i++;
                }
            } else {
                System.out.print("* ");
                // space2
                int s2 = 0;
                while (s2 <space2) {
                    System.out.print("  ");
                    s2++;
                }
                System.out.print("* ");
            }row++;
            space1--;
            System.out.println();
        }
    }
}
