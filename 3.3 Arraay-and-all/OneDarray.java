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
        System.out.println("NOW YOUR ArRAY WILL BE VISIBLE HERE:> ");
        
        System.out.println("NOW WE ARE MAKE IT IN DESCENDING ORDER..!");
        ShowDesc(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print("  "+ arr[i]);
        }
    }
    public static int[] ShowDesc(int[] arr)
    {
        int i=0;
        int j=arr.length-1;
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return(arr);
    }
}
