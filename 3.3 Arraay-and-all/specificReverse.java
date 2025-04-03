public class specificReverse {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,0};
        //suppose we want to reverse only 6 to 0 so what we can do
        ReverseSpecific(arr,2);
        System.out.println("THE ARR IS:> ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("  "+arr[i]);
        }
    }
    public static int[] ReverseSpecific(int[] arr,int start_ind)
    {
        int last_ind=arr.length-1;
        while (start_ind<last_ind) {
            int temp=arr[start_ind];
            arr[start_ind]=arr[last_ind];
            arr[last_ind]=temp;
            start_ind++;
            last_ind--;
        }
        return arr;
    }    
}
