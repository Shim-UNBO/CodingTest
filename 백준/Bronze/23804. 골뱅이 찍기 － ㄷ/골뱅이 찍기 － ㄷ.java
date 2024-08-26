import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String gol = "@";
            int n = Integer.parseInt(br.readLine());
            for (int i = 0;i<n;i++){
                bw.write(gol.repeat(n*5)+"\n");
            }
            for (int i = 0;i<n*3;i++){
                bw.write(gol.repeat(n)+"\n");
            }
            for (int i = 0;i<n;i++){
                bw.write(gol.repeat(n*5)+"\n");
            }
            bw.flush();
            bw.close();
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
