package RecursionPractice;

public class getNumberOfZerosRecursion {
    public static void main(String[] args) {
        System.out.println(getNumberOfZerosRecursion(2030));
        System.out.println(getNumberOfZerosRecursion(200030));
        System.out.println(getNumberOfZerosRecursion(1204));
    }
    public static int getNumberOfZerosRecursion(int n){
        int num = 0;
        if(n ==0) {
            return 1;
        }
        if(n<10) {
            return 0;
        }
        else if(n%10==0)
        {
            return 1+getNumberOfZerosRecursion(n/10);
        }
        return getNumberOfZerosRecursion(n/10);
    }

}

