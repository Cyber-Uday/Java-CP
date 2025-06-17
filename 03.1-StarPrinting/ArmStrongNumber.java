import java.util.*;
public class ArmStrongNumber {
    public static void main(String[] args) {
        int no = 1522;
        isArmStrong(no);
    }
    public static void isArmStrong(int no) {
        int number = no;
        int ndigits = NumberOfDigits(no);
        System.out.println("Number of digits:> " + ndigits);
        int sum = 0;
        int mul = ndigits;
        while (no > 0) {
            int rem = no % 10;
            sum = (int) ((int) sum + Math.pow(rem, mul));
            no = no / 10;
        }
        System.out.println("TOTAL SUM IS:> " + sum);
        if (sum == number) {
            System.out.println("THIS IS AN ARMSTRONG NUMBER");
        } else {
            System.out.println("THIS IS NOT AN ARM STRONG NUMBER");
        }
    }
    public static int NumberOfDigits(int no) {
        int count = 0;
        while (no > 0) {
            no /= 10;
            count++;
        }return count;
    }
}
