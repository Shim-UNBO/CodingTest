import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            int totalMoney = Integer.parseInt(br.readLine());
            int cnt = Integer.parseInt(br.readLine());
            int sum = 0;
            for (int i = 0; i<cnt; i++){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                int obj1 = Integer.parseInt(st.nextToken());
                int obj2 = Integer.parseInt(st.nextToken());
                sum += obj1 * obj2;
            }
            if (sum == totalMoney){
                bw.write("Yes");
            } else{
                bw.write("No");
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
