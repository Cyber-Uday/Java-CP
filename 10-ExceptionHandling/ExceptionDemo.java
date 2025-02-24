import java.util.*;
public class ExceptionDemo {
    public static void main(String[] args) {
        //Divide By Zero Exception>> 
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        System.out.println("Enter the 2 : number to divide:> ");
        int num2=sc.nextInt();
        try
        {
            if(no==0 || num2==0)
        {
            System.out.println("You cant Divide the number by zero");
        }
        else
        {
            System.out.println("THE DIVISION Is:"+(no/num2));
        }
         throw exception;
        }
    }
}
