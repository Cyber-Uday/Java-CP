public class ReverseArray {
    public static void main(String[] args) {
        // here we are get the predefine the array and make it reverse;;>>

        int[] arr = { 10, 20, 30, 40, 50 };
        ReverseArr(arr);
        System.out.println("AFTER REVERSE ARRAY:> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  " + arr[i]);
        }
    }

    public static int[] ReverseArr(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        System.out.println("THE MAX OF J IS:> " + j);
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
