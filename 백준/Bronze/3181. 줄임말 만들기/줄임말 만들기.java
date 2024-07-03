import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static String[] cutWords = {"i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili"};
    public static void main(String[] args) {
        try {
            String[] word = br.readLine().split(" ");
            checkWord(word);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void checkWord(String[] word) {
        String addWord="";
        for (int k=0; k<cutWords.length; k++){
            if (word[0].equals(cutWords[k])){
                addWord = cutWords[k];
            }
        }
        for(int i =0;i<word.length;i++){
            for (int j=0; j<cutWords.length; j++){
                    String word2 = cutWords[j];
                        word=Arrays.stream(word)
                                .filter(item -> !item.equals(word2))
                                .toArray(String[]::new);
            }
        }
        if (addWord.isEmpty()){
            printShortWord(word);
        }
        else{
            String[] newArray = new String[word.length + 1];
            newArray[0] = addWord;
            System.arraycopy(word, 0, newArray, 1, word.length);
            printShortWord(newArray);
        }

    }
    public static void printShortWord(String[] word) {
        for (int i=0; i<word.length; i++){
            System.out.print(word[i].toUpperCase(Locale.ROOT).charAt(0));
        }
    }
}
