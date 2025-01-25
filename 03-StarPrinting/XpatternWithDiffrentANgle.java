import java.util.*;

public class XpatternWithDiffrentANgle {
    public static void main(String[] args) {
        int row = 1;
        int star = 1;
        int no = 5;
        int space = no / 2 + 1;
        int space1=0;
        while (row <= no) {
            //space 1@
            int k=0;
            while (k < space1) {
                System.out.print("  ");
                k++;
            }
            // star
            int i = 0;
            while (i < star) {
                System.out.print("* ");
                i++;
            }
            // space2
            int j = 0;
            while (j < space) {
                System.out.print("  ");
                j++;
            }
            if(row==no/2+1)
            {
                System.out.print("  ");
            }
            else
            {
                System.out.print("* ");
            }
            if (row <= no / 2) {
                space-=2;
                space1++;
            } else {
                space+=2;
                space1--;
            }
            // next row prep
            row++;
            System.out.println();
        }
    }
}
