import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    // 주어진 문자열이 팰린드롬인지 확인하는 메서드
    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // 팰린드롬을 만들기 위해 필요한 최소한의 추가 문자열 길이를 반환하는 메서드
    public static int minAddToMakePalindrome(String input) {
        int length = input.length();

        for (int i = 0; i < length; i++) {
            if (isPalindrome(input.substring(i))) {
                return i;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            int result = minAddToMakePalindrome(input);
            System.out.println(input.length() + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
