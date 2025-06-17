//when Constructor take own object as a parameter called the Copy Constructor
import java.util.*;

import javax.print.attribute.standard.CopiesSupported;
public class CopyConstructor {
    int num1,num2;
    int a;
    CopyConstructor()
    {
        num1=20;
        num2=30;
    }
    CopyConstructor(CopyConstructor c)
    {
        a=c.num1+c.num2;
    }
    void display()
    {
        System.out.println("add is:> "+(num1+num2));
        System.out.println("value of a is:> "+a);
    }
    public static void main(String[] args) {
        CopyConstructor c=new CopyConstructor();
        CopyConstructor d=new CopyConstructor(c);
        c.display();d.display();
    }
}
