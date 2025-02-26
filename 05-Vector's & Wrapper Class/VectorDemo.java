import java.util.*;

//vector is an dynamic array or extensible array 
//vector automatically grow when they run out of space
public class VectorDemo {
    public static void main(String[] args) {
        // syntax:
        /*
         * Vector v1 = new Vector();
         * or
         * Vector v1=new Vector<>();
         * or
         * Vector v1=new Vector(10);
         */
        // method's of the vector
        Vector v1 = new Vector();
        v1.add(10);// add the element
        int b = 20;
        v1.addElement(b);// adding the element at end;
        v1.insertElementAt(30, 1);// insert element at perticular position
        System.out.println("SIZE OF VECTOR After Add ALL:> " + v1.size());// size of the Vector
        v1.removeElementAt(2);
        v1.removeElement(10);
        System.out.println("ELEMENT's IN VECTOR :> " + v1);

    }
}
