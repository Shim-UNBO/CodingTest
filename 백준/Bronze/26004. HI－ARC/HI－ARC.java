import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            Map<String, Integer> frequencyMap = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String[] strArray = new String[n];
//            String[] hiarc = {"H","I","A","R","C"};
            Set<String> keysToKeep = new HashSet<>();
            keysToKeep.add("H");
            keysToKeep.add("I");
            keysToKeep.add("A");
            keysToKeep.add("R");
            keysToKeep.add("C");

            for (int i = 0; i<str.length();i++){
                strArray[i] = String.valueOf(str.charAt(i));
            }
            for (String a : strArray){
                frequencyMap.put(a,frequencyMap.getOrDefault(a,0)+1);
            }
            // 키 집합에 retainAll 사용하여 필요한 키만 남김
            frequencyMap.keySet().retainAll(keysToKeep);
            if (frequencyMap.size() == 5){
                int minValue = Collections.min(frequencyMap.values());
//                for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
//                    String key = entry.getKey();
//                    int frequency = entry.getValue();
//
//                    bw.write(key + " : " +frequency+"\n");
//                }
                bw.write(minValue+"");
            }
            else{
                bw.write(0+"");
            }
            bw.flush();
            bw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
