import java.util.*;

public class MixSlashPattern {
    public static void main(String[] args) {
        // define the imp thing's
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int row = 1;
        int star = 1;
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
                if(j%2==0)
                {
                System.out.print("* ");
                }
                else
                {
                    System.out.print("! ");
                }
                j++;
            }
            // next row prep
            row++;
            star += 2;
            space--;
            System.out.println();
        }
    }
}
