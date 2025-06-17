import java.util.*;

public class NewPattern {
    public static void main(String[] args) {
        int row = 1;// 1 to n.>>
        int star = 7;
        int num = 3;
        int space = star % 2 + 2;
        int number = 1;
        while (row <= num) {
            // space
            if (row != 2) {
                int s = 0;
                while (s < space) {
                    System.out.print("  ");
                    s++;
                }
            }
            // star print
            if (row == 2) {
                int i = 0;
                while (i < star) {
                    System.out.print(number + " ");
                    i++;
                    number++;
                }
            } else {
                System.out.print((space+1)+ " ");
            }
            // next row prep
            row++;
            System.out.println();
        }
    }
}
