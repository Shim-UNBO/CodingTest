import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int[] n = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int[] numbers = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();
            for (int num : numbers){
                frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
            }

            List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
            entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

            for (Map.Entry<Integer, Integer> entry : entryList) {
                //나온 숫자
                int number = entry.getKey();
                //빈도 수
                int frequency = entry.getValue();
                for (int i =0;i<frequency;i++){
                    System.out.print(number+" ");
                }
//                String repeatedNumber = String.valueOf(number).repeat(frequency);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
