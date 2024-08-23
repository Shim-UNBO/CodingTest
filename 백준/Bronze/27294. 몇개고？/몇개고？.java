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
            int time = n[0];
            int alcohol = n[1];
            if ( time>=12 && time<=16 && alcohol ==0){
                bw.write(String.valueOf(320));
            }else {
                bw.write(String.valueOf(280));
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
