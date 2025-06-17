import java.util.*;

public class DimondPrinting {
    public static void main(String[] args) {
        // define the required Things
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int star = 1;
        int row = 1;
        int space1 = num - 1;
        int space2 = -1;
        while (row <= num * 2 - 1) {
            // space 1
            int s1 = 0;
            while (s1 < space1) {
                System.out.print("  ");
                s1++;
            }
            // star
            System.out.print("* ");
            // space 2
            int s2 = 0;
            while (s2 < space2) {
                System.out.print("  ");
                s2++;
            }
            if (row==1 || row==num*2-1) {
                System.out.print(" ");
            }
            else
            {            
                System.out.print("* ");
            }
            if (row < num) {
                space1--;
                space2 += 2;
            } else {
                space1++;
                space2 -= 2;
            }
            row++;
            System.out.println("");
        }
    }
}