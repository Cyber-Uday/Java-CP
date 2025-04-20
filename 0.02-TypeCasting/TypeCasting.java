//the process of converting one data type into another data type called
// the type casting

/*
 * there are 2 types of typecasting 
 * 1) Implicit TYpe Casting - Done by the system
 * 2) Explicit TYpe Casting- done by the user/programmer
 */
import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        ImplicitTypeCasting();
        ExplicitTypeCasting();
    }
    public static void ImplicitTypeCasting() {
        int a = 20;
        float b = a;//here done by the system
        System.out.println("THE VALUE OF A IS:> " + b);
    }
    public static void ExplicitTypeCasting()
    {
        double c =30.6;
        int a=(int) c;//here we need to say manually
        System.out.println("The value of a is:>"+a);
    }
}
