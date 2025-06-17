import java.util.Scanner;
public class BoxPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Number HERE:>  ");
        int no = sc.nextInt();
        int star = 1;
        int space = no /2+1;
        int row = 1;
        while (row <= no) {
            // star
            if (row == 1 || row == no) {
                int i = 1;
                while (i <= no) {
                    System.out.print("* ");
                    i++;
                }
            }
            //single Star
            if(row>1 && row<no)
            {
                System.out.print("* ");
            //space
            int j=0;
            while (j<space) {
                System.out.print("  ");
                j++;
            }
            System.out.print("* ");
            }
            // next row prep
            row++;
            System.out.println();
        }
    }
}
