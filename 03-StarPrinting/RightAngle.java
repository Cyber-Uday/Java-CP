import java.util.*;

public class RightAngle {
    public static void main(String[] args) {
        //define which things are required..!
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER YOU WANT :> ");
        int Enter_num=sc.nextInt();
        int star=1;
        int row=1;
        while (row<=Enter_num) {
            //star
            int j=0;
            while (j<star) {
                System.out.print("* ");
                j++;
            }
            star++;
            row++;
            System.out.println();
            //next row prep
        }
    }
}
