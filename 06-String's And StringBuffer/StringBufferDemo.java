import java.util.*;

//String buffer is peer class of string 
/* 
 * String Class create fix length of string then perform the operation 
 * but in string buffer you can add after string define also >>
 * it will create flexible length of the String..!
 * some method's of string class also supported stringbuffer..!
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("CYBER ");
        StringBuffer sb2 = new StringBuffer("Alexa ");
        StringBuffer sb3 = new StringBuffer("Here..! ");
        // now make look like this:> Alexa Here..! Cyber Asistant;
        System.out.println(":> " + sb2.append(sb3) + " " + sb1 + " Assistant");
        System.out.println("THE CHAR AT 2nd Position of SB1 is:> " + sb1.charAt(2));// y
    }
}
