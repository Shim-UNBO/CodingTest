import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            Map<String,Integer> semina = new HashMap<>();

            for (int i =0; i<7; i++){
                String[] str = br.readLine().split(" ");
                semina.put(str[0],Integer.parseInt(str[1]));
            }
            // hashmap에서 가장큰 밸류찾기
            String maxKey = Collections.max(semina.entrySet(), Map.Entry.comparingByValue()).getKey();
            bw.write(maxKey);
            bw.flush();
            br.close();
            bw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
