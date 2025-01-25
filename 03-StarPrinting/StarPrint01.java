//normal 1 to 5 star print in java..!
import java.util.*;

class StarPrint01
{
    public static void main(String[] args) {
        int row=5;
        int star=1;
        while (star<=row) {
            //star print
            int i=0;
            while (i<star) {
                System.out.print("*");
                i++;
            }
            //next row prep
            star++;
            System.out.println();

        }
    }
}