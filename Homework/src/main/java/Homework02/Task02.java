package Homework02;


public class Task02 {
    public static void main(String[] args) {
        int[] intArray = {1, 5, 42, 3, 46, 4, 5, 15, 46, 1, 3254, 45, 5};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
