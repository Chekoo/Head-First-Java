public class loop1 {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the Loop");
        while (x < 4) {
            System.out.println("In the loop");
            System.out.println("Value of x is " + x);
            x = x + 1;
        }
        System.out.println("This is after the loop");
    }
}

//class IfTest {
//    public static void mai(String[] args) {
//        int x = 3;
//        if (x == 3) {
//            System.out.println("x must be 3");
//        }
//        System.out.println("This runs no matter what");
//    }
//}