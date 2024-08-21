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
            int[] n = Arrays.stream(br.readLine().split(" "))
                     .mapToInt(Integer::parseInt)
                     .toArray();
            int a = n[0];
            int p = n[1];
            int c = n[2];
            if (a+c > p){
                bw.write(a+c+"\n");
            }else{
                bw.write(p+"\n");
            }
            bw.flush();
            bw.close();
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
