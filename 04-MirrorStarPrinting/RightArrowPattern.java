import java.util.*;

public class RightArrowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int row = 1;
        int star = 1;

        while (row <= no * 2 - 1) {
            // star
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            // mirror
            if (row < no) {
                star++;
            } else {
                star--;
            }
            // next row prep
            row++;
            System.out.println("");
        }
    }
}
