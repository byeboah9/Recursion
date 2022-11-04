package RecursionPractice;

public class NumberOfGloves {
    public static void main(String[] args) {
        System.out.println(numberOfGloves(0));
        System.out.println(numberOfGloves(1));
        System.out.println(numberOfGloves(3));
    }
    public static int numberOfGloves(int peopleOfPlanetU101InARoom){
        int total = 0;
        if (peopleOfPlanetU101InARoom > 0) {
            return total + 3 + numberOfGloves(peopleOfPlanetU101InARoom - 1);
        }
        return total;
    }

}
