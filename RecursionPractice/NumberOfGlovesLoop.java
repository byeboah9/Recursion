package RecursionPractice;

public class NumberOfGlovesLoop {
    public static void main(String[] args) {
        System.out.println(numberOfGloves(0));
        System.out.println(numberOfGloves(1));
        System.out.println(numberOfGloves(3));
    }
    public static int numberOfGloves(int peopleOfPlanetU101InARoom){
        int total = 0;
        for (int i = 0; i < peopleOfPlanetU101InARoom; i++) {
            total += 3;
        }
        return total;
    }

}
