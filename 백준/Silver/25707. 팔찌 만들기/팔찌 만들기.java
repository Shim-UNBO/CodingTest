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
            int n =Integer.parseInt(br.readLine());
            int[] numbers = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int max = Arrays.stream(numbers).max().getAsInt();
            int min = Arrays.stream(numbers).min().getAsInt();
            bw.write((max-min)*2+"");
//            int sum = 0;
//            for (int i=1; i<n; i++){
//                int sub = numbers[i] - numbers[i-1];
//                if (sub < 0){
//                    sum += (sub*-1);
//                }else{
//                    sum +=sub;
//                }
//            }
//            sum += numbers[0] - numbers[n-1] < 0?(numbers[0] - numbers[n-1])*-1 : numbers[0] - numbers[n-1];
//            bw.write(sum+"");
            bw.flush();
            bw.close();
            br.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
