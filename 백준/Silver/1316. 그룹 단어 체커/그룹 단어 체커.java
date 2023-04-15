import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        groupWord();
    }
    public static void groupWord(){
        Scanner sc = new Scanner(System.in);
        //System.out.println("그룹 단어 갯수를 입력해 주세요.");
        int cnt = sc.nextInt();
        ArrayList<String> words = new ArrayList<>();
        int count = 0;  // 그룹 단어의 개수를 저장할 변수

        for (int i = 0; i < cnt; i++) {
            words.add(sc.next());
        }

        for (String word : words) {
            boolean[] alphabet = new boolean[26]; 
            boolean isGroupWord = true; 

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (!alphabet[ch - 'a']) { 
                    alphabet[ch - 'a'] = true; 
                } else { 
                    if (word.charAt(i - 1) != ch) { 
                        isGroupWord = false;
                        break;
                    }
                }
            }
            if (isGroupWord) {
                count++;
            }
        }

        System.out.println(count);

    }
}

