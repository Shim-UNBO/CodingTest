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
            String str = br.readLine();
            if (n >= 5){
                for (int i = n-5; i<n; i++){
                    bw.write(str.charAt(i));
                }
            }else{
                bw.write(str);
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
