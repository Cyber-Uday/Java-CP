import java.util.*;
public class Mathematical_Functions
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY TWO NUMBER TO EXPLORE THE MATH CLASSES..!:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        //here we are going to explore all the Mathematical Function's in java;
        System.out.println("MINIMUM Number "+Math.min(num1, num2));
        System.out.println("MAXIMUM NUM:> "+Math.max(num1, num2));
        System.out.println("MATH SQUARE ROOT:> "+Math.sqrt(num2));
        System.out.println("MATH {POWER} :> "+Math.pow(num1, num2));
        System.out.println("MATH RANDOM :> "+Math.random());
        System.out.println("MATH ROUND VALUE "+Math.round(200.675));
        System.out.println("MATH ROUND VALUE "+Math.round(200.50));

    }
}