import java.util.*;

class CmdLineArgs {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        float b = Float.parseFloat(args[1]);
    Float c=Float.parseFloat(args[1]);
        double add = a + b;
        System.out.println("THE ADDITION IS:> " + add);
    }
}
// after the java compile
// while you go for the running then try to add number in last