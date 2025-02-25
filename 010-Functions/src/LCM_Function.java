import java.util.Scanner;

public class LCM_Function
{
    public static void main(String[] args) {

        System.out.println("ENTER the two number which you want get LCM:> ");
        Scanner sc=new Scanner(System.in);
        int no1=sc.nextInt();
        int no2=sc.nextInt();
        System.out.println("ENTER THE NUMBER DIVISIBLE YOU WANT THAT");
        int div=sc.nextInt();

        LCM(no1,no2,div);
    }
    public static int LCM(int no1, int no2, int div)
    {
        if(no2==div)
        {

        }
        return div;
    }
}
