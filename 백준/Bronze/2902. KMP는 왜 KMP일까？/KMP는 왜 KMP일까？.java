import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input;
            while((input = br.readLine()) != null && !input.isEmpty()){
                StringTokenizer st = new StringTokenizer(input,"-");
                while (st.hasMoreTokens()){
                    String[] word = new String[]{st.nextToken()};
                    System.out.print(word[0].charAt(0));
                }
            }
        }
        catch (Exception e){

        }
    }
}
