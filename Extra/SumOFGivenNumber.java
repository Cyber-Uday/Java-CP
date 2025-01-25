import java.util.*;

public class SumOFGivenNumber {
    public static void main(String[] args) {
        System.out.println("PROGRAM RUNNING");
        int num_given_for_sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number You want to The SUM:> ");
        num_given_for_sum = sc.nextInt();
        int i = 0;
        int sum = 0;/*
                     * for(i=0;i<=num_given_for_sum;i++)
                     * {
                     * sum=sum+i;
                     * }
                     * System.out.println("TOTAL SUM OF "+num_given_for_sum+" IS: >"+sum);
                     */
        // using if Loop
        /*
         * while(i<=num_given_for_sum)
         * {
         * sum=sum+i;
         * i++;
         * }
         * System.out.println("TOTAL SUM OF "+num_given_for_sum+" IS: >"+sum);
         */
        System.out.println("TOTAL SUM OF " + num_given_for_sum + " IS: >" + sum);
    }
}