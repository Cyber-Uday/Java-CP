
interface demo0 {
    void pubg();
}

interface demo1 {
    void display();
}

interface demo2 extends demo1 {
    void Show();
}

public class MultipleInheritance implements demo0, demo2 // or we can add more like this
{
    public void display() {
        System.out.println("I am come from Demo 1 Interface");
    }

    public void Show() {
        System.out.println("I am come from Demo 2 Interface");
    }

    public void pubg() {
        System.out.println("I AM PUBG LOVER..!");
    }

    public static void main(String[] args) {
        MultipleInheritance m = new MultipleInheritance();
        m.display();
        m.Show();
        m.pubg();
    }
}
