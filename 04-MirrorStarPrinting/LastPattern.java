import java.util.*;

public class LastPattern {
    public static void main(String args[]) {
        // define require things..!
        int row = 1;// 1 to n
        int star = 1;
        int no = 3;
        int space = no - 1;
        int val = 1;

        while (row <= no * 2 - 1) {
            // space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;
            int p = val;
            while (j <= star) {
                System.out.print(p + " ");
                if (j <= star / 2) {
                    p++;
                } else {
                    p--;
                }
                j++;
            }
            // next row prep
            if (row < no) {
                space--;
                star += 2;
                val++;
            } else {
                space++;
                star -= 2;
                val--;
            }
            row++;
            System.out.println();
        }
    }
}
