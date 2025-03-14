import java.util.*;

class StarPrintDemo {
    public static void main(String args[])
    {
        //define the required things 
        int star=1;
        int space=1;
        int row=1; 
        int no=5;
        while (row<=no) {
            //space .. !
        //space 
        int s=0;
        while (s<=space) {
            System.out.print("  ");
            s++;
        }
        //here we are going to difne the right angle triangle 
        int i=0;
        while (i<star) {
            System.out.print("* ");
            i++;
        }
        row++;
        System.out.println();
        star++;
        space+=2;
        }
    }
}