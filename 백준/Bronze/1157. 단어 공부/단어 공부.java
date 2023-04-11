
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        wordStudy();
    }

    public static void wordStudy(){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int[] cntList = new int[word.length()];
        int[] counter = new int[26];
        boolean check = true;

        // 대문자 변환
        word = word.toUpperCase(Locale.ROOT);

        // 각 문자의 알파벳 인덱스 계산
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
                int index = c - 'A';
                cntList[i] = index;
        }

        // 알파벳 사용 횟수 계산 counter[i]에는 알파벳 사용횟수가 담긴다.
        for (int i = 0; i < cntList.length; i++) {
            counter[cntList[i]]++;
        }

        // 가장 많이 사용된 알파벳 찾기 maxWord에는 가장 많이 사용된 알파벳 횟수가 담긴다.
        int maxWord = 0;

        for (int i = 1; i < counter.length; i++) {
            if (counter[i] > counter[maxWord]) {
                maxWord = i;
            }
        }

        // 사용 횟수가 똑같은게 있는지 검증
        for (int i = 0; i < counter.length; i++) {
            if (i != maxWord && counter[i] == counter[maxWord]) {
                check=false;
                break;
            }
        }

        char result = (char) ('A' + maxWord);
        if (check){
            System.out.println(result);
        }else {
            System.out.println("?");
        }

    }

}
