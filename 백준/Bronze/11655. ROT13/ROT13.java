import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            System.out.println(rot13(input));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static String rot13(String input){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) ((ch - 'a' + 13) % 26 + 'a');
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ((ch - 'A' + 13) % 26 + 'A');
            }
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }

}
