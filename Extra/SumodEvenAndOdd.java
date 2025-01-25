import java.util.*;
public class SumodEvenAndOdd{
    public static void main(String[] args) {
        System.out.println("PROGRAMM RUNNING ");
        //given number is >> 3467 or user given make add of even and odd number with diffrent

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER You WANT SUM:> ");
        int Number_Given_from_user=sc.nextInt();
        int last_digit_of_given_number;
        int sum_even = 0,sum_odd=0;
        while(Number_Given_from_user>1)
        {
            last_digit_of_given_number=Number_Given_from_user%10;//7
            if(last_digit_of_given_number%2==0)//7%2==0=NO, //6%2==0 = yes
            {
                System.out.println("EVEN NUMBER FOUND : "+last_digit_of_given_number);
                sum_even=sum_even+last_digit_of_given_number;
            }
            else
            {
                System.out.println("ODD NUMBER FOUND "+sum_odd);
                sum_odd=sum_odd+last_digit_of_given_number;
            }
            Number_Given_from_user /=10;
        }
        System.out.println("THE EVEN NUMBER OF SUM IS:> "+sum_even);
        System.out.println("THE ODD NUMBER SUM IS:> "+sum_odd);

    }
}
