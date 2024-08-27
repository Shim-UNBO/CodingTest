import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());
            int[] nArray = new int[n];
            String stick = "=";
            for (int i =0;i<nArray.length;i++){
                nArray[i] = Integer.parseInt(br.readLine());
            }
            for (int i =0;i<nArray.length;i++){
                bw.write(stick.repeat(nArray[i])+"\n");
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
