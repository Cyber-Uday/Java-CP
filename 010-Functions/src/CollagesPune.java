import java.util.Scanner;

public class CollagesPune
{
    public static void main(String[] args) {
        System.out.println(  "you want to go at ::>> "+GetCollageName());
    }

    public static String GetCollageName()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the collage name you want to go ");
       String collagename =sc.next();
       return  collagename;

    }

}
