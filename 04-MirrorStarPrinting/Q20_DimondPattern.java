import java.util.*;

public class Q20_DimondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int row = 1;// 1 to 7;
        int star = 1;
        int space1 = no / 2;
        int space2 = -1;
        while (row <= no) {
            // space1
            int i = 1;
            while (i <= space1) {
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;
            if (row==1||row==no) {
                j=2;
            }
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            // space 2
            int k = 1;
            while (k <= space2) {
                System.out.print("  ");
                k++;
            }
            System.out.print("* ");
            // mirror
            if (row <= no / 2) {
                space1--;
                space2 += 2;
            } else {
                space1++;
                space2 -= 2;
            }
            // next row prep
            row++;
            System.out.println();
        }
    }
}
