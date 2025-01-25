import java.util.*;

public class Q16UmbreallaUtlaPattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int row=1;
        int star=no;
        int space=no-1;
        while (row<=no*2-1) {
            //space
            int i=1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            //star
            int j=1;
            while (j<=star) {
                System.out.print("* ");
                j++;
            }
            //mirror concept
            if(row<no)
            {
                space-=1;
                star-=1;
            }
            else
            {
                space+=1;
                star+=1;
            }
            //next row prep
            row++;
            System.out.println();
        }
    }
}