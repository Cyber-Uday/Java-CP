//here we are going to explore the Type Casting and add here one if condition..!

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1 = 10.23f, num2 = 20.45f;
        int Bigger = (int) Math.max(num1, num2);
        if (Bigger > 10) {
            System.out.println("THE BIGGER IS :>" + Bigger);
        }
    }
}
