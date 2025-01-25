import java.util.*;
public class PureTriangle {
    public static void main(String[] args) {
        //just difine what things are required..!
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int row=1;
        int star=1;
        int space=no;
        while (row<=no) {
            //space
            int i=0;
            while (i<space) {
                System.out.print("  ");
                i++;
            }
            //2x star
            int j=0;
            while (j<star) {
                System.out.print("* ");
                j++;
            }
            //next row prep
            space--;
            star=star+2;
            row++;
            System.out.println();
        }
    }
}
