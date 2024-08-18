import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String s = br.readLine();
            int[] alphabetCount = new int[26];

            for (int i =0; i<s.length(); i++){
                char character = s.charAt(i);
                if (character >= 'a' && character <= 'z') {
                    alphabetCount[character - 'a']++;
                }
//                int ascii = (int) character;
//                bw.write(ascii+"\n");
            }
            for (int i = 0; i<alphabetCount.length; i++){
                bw.write(alphabetCount[i]+" ");
            }
            bw.flush();
            bw.close();
            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
