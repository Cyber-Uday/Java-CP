import java.util.*;

public class UmbrellaPattern {
    public static void main(String[] args) {
        // define requiered things ...!
        Scanner sc = new Scanner(System.in);
        int no_given = sc.nextInt();
        int row = 1;
        int star = no_given;
        int space = 0;
        while (row <= no_given) {
            
            // space
            int j = 0;
            while (j < space) {
                System.out.print("  ");
                j++;
            }
            // star
            int i = 0;
            while (i < star) {
                System.out.print("* ");
                i++;
            }
            
            // next row prep
            star--;
            space+=2;
            row++;
            System.out.println();
        }
    }

}
