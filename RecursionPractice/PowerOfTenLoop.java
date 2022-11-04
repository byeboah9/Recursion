package RecursionPractice;

public class PowerOfTenLoop {
    public static void main(String[] args) {
        System.out.println(getPowerOfTen(5));
        System.out.println(getPowerOfTen(3));
        System.out.println(getPowerOfTen(2));
    }
    public static long getPowerOfTen(int n){
        long total = 1;
        for (long i = 0; i < n; i ++) {
            total *= 10;
        }
        return total;
    }
}
