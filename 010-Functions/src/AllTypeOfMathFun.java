import java.util.Scanner;

public class AllTypeOfMathFun
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE TWO NUMBER FOR ADD SUB MUL & DIV");
        int a=sc.nextInt();
        int b=sc.nextInt();
        ADD(a,b);
    }
    public static void ADD(int z,int y)
    {
        System.out.println("THE ADDTITION IS : "+(z+y));
        SUB(z,y);
    }

    public  static void SUB(int p, int q)
    {
        System.out.println("THE SUBTRACTION IS : "+(p-q));
        MUL(p,q);
    }
    public static void MUL(int u, int d)
    {
        System.out.println("THE MULTIPLACTION IS :"+(u*d));
        DIV(u,d);
    }
    public static void DIV(int s,int r)
    {
        System.out.println("THE DIVISION IS :"+(s/r));
        MOD(s,r);
    }
    public static void MOD(int f,int r)
    {
        System.out.println("THE MOD OF 2 num is "+(f%r));
    }
}
