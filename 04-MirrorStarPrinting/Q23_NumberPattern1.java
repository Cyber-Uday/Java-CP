import java.util.*;

public class Q23_NumberPattern1 {
    //print number from 1 to n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = no - 1;
        int number = 1;
        while (row <= no) {
            // space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;
            while (j <= star) {
                System.out.print(number + " ");
                j++;
                number++;
            }
            // next row prep
            row++;
            star += 2;
            space--;
            System.out.println();
        }
    }
}
