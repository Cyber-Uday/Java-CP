//getting user input from the user of arr and showing it ..!

import java.util.Scanner;
public class OneDarray {
    public static void main(String[] args) {
        System.out.println("Enter The Size of The Array :>>>> ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr =new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("<<<::: SHOWING THE ARRAY HERE :::>>");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("  "+arr[i]);
        }
    }
}