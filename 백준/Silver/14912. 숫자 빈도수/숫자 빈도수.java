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
            int[] numbers = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int number = numbers[0];
            int chkNum = numbers[1];
            ArrayList<Integer> array = new ArrayList<>();
            for (int i = 1; i <= number; i++) {
                if (i < 10) {
                    array.add(i);
                } else {
                    String numStr = String.valueOf(i);
                    //숫자 쪼개기
                    for (char c : numStr.toCharArray()) {
                        //정수로 변환
                        array.add(Character.getNumericValue(c));
                    }
                }
            }
            //빈도수 검사
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : array) {
                frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
            }
            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                int num = entry.getKey();
                int frequency = entry.getValue();
                if (num == chkNum) {
                    bw.write(frequency+"");
                }
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
