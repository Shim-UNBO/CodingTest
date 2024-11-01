import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            int n = Integer.parseInt(br.readLine());
            int[] numbers = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int sum = 0;
            int curCnt = 0;
            if (numbers.length > 1) {
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] == 1){
                        sum += ++curCnt;
                    }else{
                        curCnt = 0;
                    }
                }
            }else{
                bw.write(numbers[0] == 0 ? "0" : "1");
            }
            bw.write(sum+"\n");
            bw.flush();
            bw.close();
            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
