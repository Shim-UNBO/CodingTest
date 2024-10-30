import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int chicken = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int cola = Integer.parseInt(st.nextToken());
            int beer = Integer.parseInt(st.nextToken());
            int totalEat = 0;
            while(cola > 1 || beer > 0){
                if (cola > 1){
                    cola -= 2;
                    totalEat += 1;
                }
                if (beer > 0){
                    beer -= 1;
                    totalEat += 1;
                }
            }

            bw.write(String.valueOf(totalEat >= chicken ? chicken : totalEat));
            bw.flush();
            bw.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
