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
            String star = "*";
            String blink = " ";
            for (int i = 1 ; i< n*2;i++){
                int cnt = n;
                int starCnt = 0;
                if (i >= n) {
                    cnt = i - cnt;
                }else{
                    cnt = cnt - i;
                }
                bw.write(blink.repeat(cnt));
                if (i > n){
                    starCnt = n*2-i;
                }else{
                    starCnt = i;
                }
                bw.write(star.repeat(starCnt));
                bw.newLine();
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
