import java.util.*;
public class DimondPatternDemo {
    public static void main(String[] args) {
        int row=1;
        int no=3;
        int space=no-1;
        int star=1;
        while (row<no*2) 
        {
            // Space
            int s=0;
            while (s<space) {
                System.out.print("  ");
                s++;
            }
            //star print
            int i=0;
            while(i<star)
            {
                System.out.print("* ");
                i++;
            }
            if (row<no) {
                star+=2;
                space--;
            }
            else
            {
                space++;
                star-=2;
            }
            row++;
            System.out.println();
            
        }
    }
}
