import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        star2();
    }
public static void star2() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (1 <= num && num <= 100) {
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= num - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
                if (i == num) {
                    for (int k = num - 1; k >= 1; k--) {
                        for (int j = 1; j <= num - k; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * k - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }

            }
        } else {
            System.out.println("1에서 100까지 입력해주세요");
        }
    }
}