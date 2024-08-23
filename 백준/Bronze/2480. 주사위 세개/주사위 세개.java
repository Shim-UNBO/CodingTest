import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            int[] diceN = Arrays.stream(br.readLine().split(" "))
                          .mapToInt(Integer::parseInt)
                          .toArray();
            Arrays.sort(diceN);

            Map<Integer, Integer> countMap = new HashMap<>();
            int temp = 1;
            int bigN = 0;
            for (int num : diceN) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }

            for (Integer key : countMap.keySet()) {
                int value = countMap.get(key);
                if(temp < value){temp = value;}
            }
            if (temp != 1){
                for (Integer key : countMap.keySet()) {
                    int value = countMap.get(key);
                    if (temp == value){bigN = key;}
                }
                if (temp == 2){
                    bw.write((bigN*100)+1000+"\n");
                }
                else {
                    bw.write((bigN*1000)+10000+"\n");
                }
            }else{
                bw.write(diceN[2]*100+"\n");
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
