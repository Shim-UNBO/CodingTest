import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int[] numbers = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int[] s1 = new int[numbers[0]];
            int[] s2 = new int[numbers[1]];
            int[] s3 = new int[numbers[2]];
            for (int i =0;i<numbers.length;i++){
                for (int j = 0; j<numbers[i];j++){
                    if (s1[numbers[0]-1] == 0){
                        s1[j] = j+1;
                    }else if (s2[numbers[1]-1] == 0){
                        s2[j] = j+1;
                    }else{
                        s3[j] = j+1;
                    }
                }
            }
            Map<Integer, Integer> frequencyMap = new HashMap<>();

            for (int num1 : s1) {
                for (int num2 : s2) {
                    for (int num3 : s3) {
                        int sum = num1 + num2 + num3;
                        frequencyMap.put(sum, frequencyMap.getOrDefault(sum, 0) + 1);
                    }
                }
            }

            int mostFrequentSum = 0;
            int maxFrequency = 0;

            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                int sum = entry.getKey();
                int frequency = entry.getValue();

                if (frequency > maxFrequency) {
                    maxFrequency = frequency;
                    mostFrequentSum = sum;
                }
            }
            bw.write(mostFrequentSum+"");
            bw.flush();
            bw.close();
            br.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
