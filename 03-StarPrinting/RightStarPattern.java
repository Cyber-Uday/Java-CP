import java.util.*;
public class RightStarPattern {
    public static void main(String[] args) {
        //mention require things>>
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int star=1;
        int space=no-1;
        int row=1; // 1 to n
        while (row<=no) {
            //space>>
            int s=0;
            while (s<space) {
                System.out.print("  ");
                s++;
            }
            // star>> 
            int i=0;
            while (i<star) {
                System.out.print("* ");
                i++;
            }
            //next row prep
            row++;
            star++;
            space--;
            System.out.println();
        }
    }
}
