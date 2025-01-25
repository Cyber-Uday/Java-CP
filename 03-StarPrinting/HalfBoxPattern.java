import java.util.*;

public class HalfBoxPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int row = 1;// 1 to n
        int star = 1;
        int space = no + 2;
        while (row <= no) {
            // star
            int i = 0;
            while (i < star) {
                System.out.print("* ");
                i++;
            }
            // space
            int j = 0;
            while (j < space) {
                System.out.print("  ");
                j++;
            }
            //star
            int k=0;
            if(row==no)
            {
                k=1;
            }
            while (k<star) {
                System.out.print("* ");
                k++;
            }
            // next row prep
            star++;
            row++;
            space-=2;
            System.out.println();
        }
    }
}
