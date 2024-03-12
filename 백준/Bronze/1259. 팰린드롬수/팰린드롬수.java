import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        palindrome();
    }
    public static void palindrome(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        try {
            while ((input = br.readLine()) != null && !input.isEmpty()) {
                StringTokenizer st = new StringTokenizer(input);
                if (st.hasMoreTokens()){
                    String word = st.nextToken();
                    if(Integer.parseInt(word)==0){
                        break;
                    }
                    int num = 1;
                    int length = word.length();
                    int middleIndex = length / 2;
                    for (int i = 0; i < middleIndex; i++) {
                        if (word.charAt(i) != word.charAt(length - 1 - i)) {
                            num = 0;
                        }
                    }
                    if (num == 1){
                        System.out.println("yes");
                    }else {
                        System.out.println("no");
                    }
                }
            }
        }
        catch(Exception e){
                e.printStackTrace();
            }
        }
    }
