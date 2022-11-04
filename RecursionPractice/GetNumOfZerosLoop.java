package RecursionPractice;

public class GetNumOfZerosLoop {
    public static void main(String[] args) {
        System.out.println(getNumberOfZerosLoop(2030));
        System.out.println(getNumberOfZerosLoop(200030));
        System.out.println(getNumberOfZerosLoop(1204));
    }
    public static int getNumberOfZerosLoop(int n){
        int num = 0;
        while (n != 0) {
            if (n % 10 == 0) {
                num ++;
            }
            n = n / 10;
        }
        return num;
    }

}
