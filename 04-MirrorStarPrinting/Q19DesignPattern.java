import java.util.*;

public class Q19DesignPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int row = 1;
        int star = no/2+1;
        int space = -1;
        while (row <= no) {
            // star
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            //space
            int j=1;
            while (j<=space) {
                System.out.print("  ");
                j++;
            }
            //star
            int k=1;
            if (row==1||row==no) {
                k=2;
            }
            while (k<=star) {
                System.out.print("* ");
                k++;
            }
            // mirror concept
            if(row<=no/2)
            {
                space+=2;
                star-=1;
            }
            else
            {
                space-=2;
                star+=1;
            }
            // next row prep
            row++;
            System.out.println();
        }
    }
}
