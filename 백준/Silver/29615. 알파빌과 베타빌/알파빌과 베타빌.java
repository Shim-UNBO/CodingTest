import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            int[] setting = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int[] numbers = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int[] friends = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i=0;i<friends.length;i++){
                for (int j =0; j<numbers.length; j++){
                    if (friends[i]==numbers[j]){
                        map.put(friends[i],j);
                    }
                }
            }
            int cnt=0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int value = entry.getValue();
//                int key = entry.getKey();
                if (value >= setting[1]){
                    cnt++;
                }
//                    bw.write("Key : "+entry.getKey()+" Value : "+entry.getValue());
            }
            bw.write(String.valueOf(cnt));
            bw.flush();
            bw.close();
            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
