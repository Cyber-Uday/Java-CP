import java.util.*;

public class BtoD {
    public static void main(String[] args) {
        // basically we are going to here explore the binary to decimal Number ..!>>
        int number = 101;
        int sum = 0;
        int mul = 1;
        while (number > 0) {
            int rem = number % 10;
            sum = sum + rem * mul;
            mul = mul * 2;
            number /= 10;
        }
        System.out.println(sum);
    }
}
