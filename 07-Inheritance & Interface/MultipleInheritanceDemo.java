import java.util.*;
//here we are going to implement the Interface to achive multiple inheritance
interface Add
{
    int a=10;
    int b=20;
    void add();
}
interface  MUL  {
    void multiply(int a,int b);
}
public class MultipleInheritanceDemo implements Add,MUL {
    public void add()
    {
        System.out.println("THE ADDITION IS:<"+(a+b));
    }
    public void multiply(int a,int b)
    {
        System.out.println("Multiplaction:> "+(a*b));
    }
    public static void main(String[] args) {
    MultipleInheritanceDemo mi=new MultipleInheritanceDemo();
        mi.add();
        mi.multiply(10, 20);
    }
}