import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            Map<Character, String> map = new HashMap<>();
            map.put('B', "v");
            map.put('E', "ye");
            map.put('H', "n");
            map.put('P', "r");
            map.put('C', "s");
            map.put('Y', "u");
            map.put('X', "h");
            String str = br.readLine();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                if (map.containsKey(currentChar)) {
                    result.append(map.get(currentChar));
                } else {
                    result.append(currentChar);
                }
            }

            bw.write(String.valueOf(result).toLowerCase());
            bw.flush();
            bw.close();
            br.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
