import java.util.Scanner;

public class FunctionDemo1
{
    public static void main(String[] args) {
        int no;
       do{
           System.out.println("HEY DO YOU WANT TO SEE MY HIDDEN WORLD");
           System.out.println("ENTER THE NUMBER 1  to hidden world or 0 to aske me again :");
           Scanner sc=new Scanner(System.in);
           no=sc.nextInt();
       }while(no!=1);
       HiddenWorld();

    }
    public static  void HiddenWorld()
    {
        System.out.println("ENTER TO THE HACKING WORLD's");
    }

}
