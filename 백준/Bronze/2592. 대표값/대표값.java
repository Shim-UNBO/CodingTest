import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int[] numbers = new int[10];
            int sum = 0;
            int avg = 0;
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int i = 0; i<numbers.length; i++){
                numbers[i] = Integer.parseInt(br.readLine());
                sum+=numbers[i];
            }

            for (int num : numbers) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            int MostNumber = 0;
            List<Integer> mostFrequentNumbers = new ArrayList<>();

            MostNumber = getMaxFrequency(frequencyMap, mostFrequentNumbers);

            avg = culcuAvg(sum);

            bw.write(avg+"");
            bw.newLine();
            bw.write(MostNumber+"");
            bw.flush();
            bw.close();
            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static int getMaxFrequency(Map<Integer, Integer> frequencyMap ,List<Integer> mostFrequentNumbers) {
        int maxFrequency = 0;
        int MostNumber = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int currentFrequency = entry.getValue();

            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                mostFrequentNumbers.clear();
                mostFrequentNumbers.add(entry.getKey());
            }
//                else if (currentFrequency == maxFrequency) {
//                    mostFrequentNumbers.add(entry.getKey());
//                }
        }
        MostNumber = mostFrequentNumbers.get(0);
        return MostNumber;
    }

    private static int culcuAvg(int sum) {
        int avg;
        avg = sum / 10;
        return avg;
    }
}
