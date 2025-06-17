import java.util.Scanner;

public class CopyConstructor {
    int data;
    CopyConstructor()
    {
        System.out.println("I AM COPY CONSTRUCTOR");
    }
    CopyConstructor(CopyConstructor cc)
    {
        data=cc.data;
        System.out.println("THE VALUE OF YOUR ADD IS:> "+data);
    }
    void display()
    {
        System.out.println("THE DATA IS:> "+data);
    }
    public static void main(String[] args) {
        System.out.println("PLEASE ENTER THE DETAILS BELOW");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int add=num1+num2;
        CopyConstructor objConstructor=new CopyConstructor();
        CopyConstructor obj2=new CopyConstructor(objConstructor);
    }
}
