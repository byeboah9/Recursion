package RecursionPractice;

public class DisplayString {
    public static void main(String[] args) {
        System.out.println(displayString("#", 3));
        System.out.println(displayString("&", 5));
        System.out.println(displayString("Hello", 7));


    }

    public static String displayString(String str, int n){
        if (n > 0) {
            return str + displayString(str, (n-1));
        }
        return "";
    }


}
