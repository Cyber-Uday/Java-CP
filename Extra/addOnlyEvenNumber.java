import java.util.*;

public class addOnlyEvenNumber {
    // here we need to add only even number from given number << 3467 >>
    public static void main(String[] args) {
        int last_number;
        int number_given = 34567;
        int sum = 0;
        int sum_odd=0;
        while (number_given > 1) {
            last_number = number_given % 10;
            // 7
            if (last_number % 2 == 0) // if 7%2 No , if 6
            {
                sum = sum + last_number;
            }
            else
            {
                sum_odd+=last_number;
            }
            number_given = number_given / 10;//
        }
        System.out.println("THE Sum Of Even Number is  :> " + sum);
        System.out.println("THE ODD NUMBER OF SUM IS:> "+sum_odd);
    }
}
