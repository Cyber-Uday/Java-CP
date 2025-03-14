public class YourNameStarPrint {

    public static void main(String[] args) {
        // here we are going to explore our first name uday in this strar print ..!
        // see how we get the name of capital " U "

        PrintCaptialU();
        PrintCaptialD();
    }

    public static void PrintCaptialU() {
        // here we are going to explore only Captial U >>
        // using num as 5>>
        int num = 5;
        int row = 1;
        int star = num;
        int space = (num + 1) / 2;// 3 may be
        while (row <= num) {
            // star of 2
            if (row < num) {
                System.out.print("**");
                // space
                int s1 = 0;
                while (s1 < space) {
                    System.out.print("  ");
                    s1++;
                }
                System.out.print("**");
            } else {
                int i = 0;
                while (i < star) {
                    System.out.print("**");
                    i++;
                }
            }
            row++;
            System.out.println();
        }
    }

    public static void PrintCaptialD() {
        // here we are going to Print Capital D Name :> #
        int row = 1;
        int num = 5;
        int star = num;
        int space1 = num / 2;
        while (row <=star) {
            // full star
            if (row == 1 || row == num) {
                int i = 0;
                while (i < star) {
                    System.out.print("* ");
                    i++;
                }
            } else {
                // space 1
                System.out.print("    ");
                System.out.print("* ");
                System.out.print("  ");
                System.out.print("*  ");
            }
            row++;
            System.out.println();
        }
    }
}