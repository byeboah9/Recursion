package RecursionPractice;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
    }
    public static int factorial(int n) {
        int total = 1;
        if (n > 0) {
            return total * n * factorial(n - 1);
        }
        return total;
    }

}
