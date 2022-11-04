package RecursionPractice;

public class GetMultiChar {
    public static void main(String[] args) {
        System.out.println(getMultiChar('y', 4));
        System.out.println(getMultiChar('#', 10));
        System.out.println(getMultiChar('i', 15));


    }

    public static String getMultiChar(char ch, int n){
        if (n >= 0) {
            return ch + getMultiChar(ch, n -1);
        }
        return "";
    }
}
