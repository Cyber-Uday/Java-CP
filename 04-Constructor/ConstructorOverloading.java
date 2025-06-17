import java.util.*;
public class ConstructorOverloading {
    
            ConstructorOverloading(int a,int b)
            {
                System.out.println("Integer ADD:> "+(a+b));
            }
            
            ConstructorOverloading(double a,double b)
            {
                System.out.println("Double Add:> "+(a+b));
            }
    public static void main(String[] args) {
        //constructor overloading means constructor name are same but diffrent arguments
        ConstructorOverloading c=new ConstructorOverloading(10.5, 11.5);
        ConstructorOverloading d=new ConstructorOverloading(1, 3);
    }
}
