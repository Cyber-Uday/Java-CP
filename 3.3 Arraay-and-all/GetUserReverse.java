import java.util.*;
public class GetUserReverse {
    //here we are going to user reverse 
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY :> ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        //get arr input from user :>> 
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
//here swap code
        System.out.println("ENTER THE Start you want to reverse:> ");
        int start_index=sc.nextInt();
        System.out.println("ENTER THE LAST INDEX YOU WANT TO SWAP:>");
        int last_index=sc.nextInt();
        System.out.println("WE ARE GOING TO SWAP");
        SwapArrWithUser(arr,start_index,last_index);
        //print swap code..!
        for (int i=0;i<arr.length;i++) {
        System.out.print("  "+arr[i]);
        }
    }
    public static int[] SwapArrWithUser(int[] arr,int start_index,int last_index)
    {//swap code
        while (start_index<last_index) {
            int temp=arr[start_index];
            arr[start_index]=arr[last_index];
            arr[last_index]=temp;
            start_index++;
            last_index--;
        }
        return arr;
    }
}
