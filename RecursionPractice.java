public String displayString(String str, int n){
        while (n > 0) {
            return str + displayString(str, (n-1));
        }
        return "";
    }
public String getMultiChar(char ch, int n){
  while (n >= 0) {
            return ch + getMultiChar(ch, n -1);
        }
        return "";
}
public long getPowerOfTen(int n){
  long total = 1;
        for (int i = 0; i < n; i++) {
            return total * (10 * getPowerOfTen(n-1));
        }
        return total;
}
public int factorial(int n) {
  int total = 1;
        for (int i = 0; i < n; i ++) {
            return total * n * factorial(n - 1);
        }
        return total;
}
public int numberOfGloves(int peopleOfPlanetU101InARoom){
  int total = 0;
        if (peopleOfPlanetU101InARoom > 0) {
            return total + 3 + numberOfGloves(peopleOfPlanetU101InARoom - 1);
        }
        return total;
}
public long getPowerOfTen(int n){
  long total = 1;
        for (long i = 0; i < n; i ++) {
            total *= 10;
        }
        return total;
}
public int numberOfGloves(int peopleOfPlanetU101InARoom){
  int total = 0;
        for (int i = 0; i < peopleOfPlanetU101InARoom; i++) {
            total += 3;
        }
        return total;
}
public int getNumberOfZerosLoop(int n){
  int num = 0;
        while (n != 0) {
            if (n % 10 == 0) {
                num ++;
            }
            n = n / 10;
        }
        return num;
}
public int getNumberOfZerosRecursion(int n){
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
