import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());
            for (int i=0;i<n;i++){
                String[] str = br.readLine().split(" ");
                StringBuilder result = new StringBuilder();
                for (String word : str) {
                    String reversedWord = new StringBuilder(word).reverse().toString();
                    result.append(reversedWord);
                    bw.write(reversedWord+" ");
                }
                bw.newLine();
            }
            bw.flush();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
