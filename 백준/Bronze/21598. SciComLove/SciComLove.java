import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            int n = Integer.parseInt(br.readLine());
            String str = "SciComLove";
            for (int i =0; i<n;i++){
                bw.write(str);
                bw.write(i == n-1 ? "" : "\n");
            }
            bw.flush();
            bw.close();
            br.close();
        }
        catch (Exception e){

        }

    }
}
