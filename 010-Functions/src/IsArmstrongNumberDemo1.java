import java.util.Scanner;

public class IsArmstrongNumberDemo1
{
    public static void main(String[] args) {
        //declare needed details >>
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int count =CountDigits(no);
        System.out.println(count);
        System.out.println(FindArmStrongNumber(no,count));

    }
  //first we need to find how much number right
    public static int CountDigits(int no)
    {
        //first we need to find the number of digit's right there
        int count=0;
        while(no>0)
        {
            count++;
            no=no/10;
        }
        return count;
    }

    //find the armstrong number
    public static boolean FindArmStrongNumber(int no,int count)
    {
        int original =no;
       int digits =count;
        int sum=0;
        while(no>0)
        {
            int rem =no%10;
            sum= (int) (sum+ Math.pow(rem,digits));
            no=no/10;
        }
        if(sum==original)
        {
            return true;
        }
        else
        {
            return  false;
        }
    }
}
