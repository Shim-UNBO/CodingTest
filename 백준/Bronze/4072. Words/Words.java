import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            ArrayList<String> strArray = new ArrayList<>();

            String line;
            while (!(line = br.readLine()).equals("#")) {
                strArray.add(line);
            }
//teG ydaer rof eht weN dnalaeZ gnimmargorP tsetnoC no .ht41
//I like ice-cream.
//#

            Iterator<String> iterator = strArray.iterator();
            while (iterator.hasNext()) {
                String[] words = iterator.next().split(" ");
                for (String word : words) {
                    String reversedWord = new StringBuilder(word).reverse().toString();
                    bw.write(reversedWord + " ");
                }
                bw.write("\n");
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
