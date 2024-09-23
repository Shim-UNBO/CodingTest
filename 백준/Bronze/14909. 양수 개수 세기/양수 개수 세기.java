import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int[] numbers = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int cnt = 0;
            for (int i =0;i<numbers.length;i++){
                if (numbers[i] >= 1){
                    cnt++;
                }
            }
            bw.write(cnt+"");
            bw.flush();
            bw.close();
            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
