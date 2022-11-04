package RecursionPractice;

public class GetPowerOfTen {
    public static void main(String[] args) {
        System.out.println(getPowerOfTen(5));
        System.out.println(getPowerOfTen(3));
        System.out.println(getPowerOfTen(2));

    }
    public static long getPowerOfTen(int n){
        long total = 1;
        if (n > 0) {
            return total * (10 * getPowerOfTen(n-1));
        }
        return total;
    }

}
