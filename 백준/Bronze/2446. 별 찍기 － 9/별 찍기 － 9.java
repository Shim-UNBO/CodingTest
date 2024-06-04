import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(br.readLine());
            printPattern(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            printLine(n, i);
        }
        for (int i = 0; i < n; i++) {
            printReverseLine(n, i);
        }
    }

    public static void printLine(int n, int i) {
        //0 1 2 3 4
        // 5
        printSpaces(i);
        printStars(n,i);
        System.out.println();
    }

    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int n,int ct) {
        //9 7 5 3 1
        //0 3 5 7 9
        for (int i = 0; i < (n*2)-(ct*2+1); i++) {
            System.out.print("*");
        }
    }
    public static void printReverseSpaces(int count,int n) {
        //4 3 2 1 0
        if(n !=0){
            for (int i = 0; i < count-1-n; i++) {
                System.out.print(" ");
            }
        }
    }
    public static void printReverseStars(int n,int ct) {
        if(ct != 0) {
            for (int i = 0; i < ct*2+1; i++) {
                System.out.print("*");
            }
        }
    }
    public static void printReverseLine(int n, int ct) {
        printReverseSpaces(n,ct);
        printReverseStars(n,ct);
        if(ct != 0){
            System.out.println();
        }
    }
}
