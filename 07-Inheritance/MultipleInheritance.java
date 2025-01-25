
interface demo1
{
    void display();
}
interface demo2
{
    void Show();
}
public class MultipleInheritance implements demo1,demo2
{
    public void display()
    {
        System.out.println("I am come from Demo 1 Interface");
    }
    public void Show()
    {
        System.out.println("I am come from Demo 2 Interface");
    }
    public static void main(String[] args) {
        MultipleInheritance m=new MultipleInheritance();
        m.display();
        m.Show();
    }    
}
