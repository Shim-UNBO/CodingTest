import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        palindrome();
    } 
public static void palindrome(){
      Scanner sc = new Scanner(System.in);
      String word = sc.next();
      int num=1;
        int length = word.length();
        int middleIndex = length / 2;
        for (int i = 0; i < middleIndex; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                num=0;
            }
        }
        System.out.println(num);
    }

}
