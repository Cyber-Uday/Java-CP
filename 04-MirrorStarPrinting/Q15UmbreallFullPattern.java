import java.util.*;

public class Q15UmbreallFullPattern 
{
    //define required things..!
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int no=sc.nextInt();
    int star=no;
    int space=0;
    int row=1;
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
        //mirror
        if(row<no)
        {
            star--;
            space+=2;
        }
        else
        {
            star++;
            space-=2;
        }
        //next row prep
        row++;
        System.out.println();
    }
    }    
}
