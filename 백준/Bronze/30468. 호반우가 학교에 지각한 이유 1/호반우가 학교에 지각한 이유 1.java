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

            int[] n = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            int sum = 0;
            int avg = n[4];

            for (int i =0;i<n.length-1;i++){
                sum += n[i];
            }
            int solve = (avg * 4) - sum;
//            4 5 1 2 4
            if(solve <= 0 ){
                bw.write(0 +"\n");
            }else {
                bw.write(solve +"\n");
            }
            bw.flush();
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
