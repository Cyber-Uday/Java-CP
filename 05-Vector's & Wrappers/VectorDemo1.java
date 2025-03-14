//here we are going to explore some vectore movments 

import java.util.*;

public class VectorDemo1 {
    public static void main(String[] args) {
        Vector v1 = new Vector<>();

        v1.addElement(10);
        v1.addElement(20);
        v1.addElement(30.55);

        System.out.println("SIZE:> " + v1.size());
        System.out.println(v1);
        v1.insertElementAt(90, 0);
        System.out.println(v1);
    }
}