import java.util.*;

class LeftTriangle
{
    public static void main(String[] args) {
        //difine what things you need ..!
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZe YOU WANT PRINT DESIGN ");
        int Enter_num=sc.nextInt();
        int row=1;
        int star=1;
        int space=Enter_num;

        while(row<=Enter_num)
        {
            //space
            int i=0;
            while (i<space) {
                System.out.print("  ");
                i++;
            }
            //star
            int j=0;
            while (j<star) {
                System.out.print("* ");
                j++;
            }
            //next row prep
            space--;
            star++;
            row++;
            System.out.println();
        }
    }
}