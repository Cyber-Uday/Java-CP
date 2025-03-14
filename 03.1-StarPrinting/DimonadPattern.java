import java.util.*;

public class DimonadPattern {
    public static void main(String[] args) {
        // define require
        int number = 3;
        int row = 1;// 1 to n
        int star = 1;
        int space = number - 1;
        while (row < number * 2) {
            // space
            int s = 0;
            while (s < space) {
                System.out.print("  ");
                s++;
            }
            // star
            int i = 0;
            int val = 1;
            while (i < star) {
                System.out.print(val + " ");
                i++;
                if (i <= star / 2) {
                    val++;
                } else {
                    val--;
                }
            }
            // next row prep
            if (row < number) {
                star += 2;
                space--;
            } else {
                star -= 2;
                space++;
            }
            row++;
            System.out.println();
        }
    }
}
