//here we are going to expore the sum of given number using the loop..!
import java.util.*;
public class SumOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the Number:>");
        int input_number=sc.nextInt();
        int sum=0;
        while (input_number>0) {
            int div=input_number%10;
            sum=sum+div;
            input_number=input_number/10;
        }
    System.out.println("The Sum of Total Number is;"+sum);
    }    
}
