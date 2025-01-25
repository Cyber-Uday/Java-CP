import java.util.*;

//string is a collection of character's >> 
// string has some method so we can use that 
//string has predefind pkgs which is java.lang package
// we also create a array of string;
public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Cyber ";
        String str2 = "Alexa";
        String str3 = " Here..!";
        String str4=str1.concat(str2.concat(str3));

        // string array
        String x[] = new String[5];

        System.out.println("UPPERCASE :> " + (str1.toUpperCase() + str2.toUpperCase()));

        System.out.println("CHECKING EQUAL's:> " + str2.equals(str1));
        System.out.println("CHECKING EQUAL's:> " + str2.equals(str2));
        System.out.println(" :> "+str4);
    }
}
