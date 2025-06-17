import java.util.*;
//in this way we are going to explore the vector 
public class VectorDemo2 {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        Vector v1=new Vector(10);
        v1.addElement(10);v1.addElement(20);
        v1.addElement(30);v1.addElement(40);
        v1.addElement(50);v1.addElement(60);
        System.out.println("Initial Vector Size just add:> "+v1);
        v1.removeElementAt((3));
        v1.removeElementAt(4);
        System.out.println("After remove 3rd AND 4th object :> "+v1);
        System.out.println("Now we are Going to add the 100 and 150 at 3rd and 4th position");
        v1.insertElementAt(100,  3);
        v1.insertElementAt(150, 4);
        System.out.println(v1);
        
    }
}
