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
            for (int i =0; i<n; i++){
                String str = br.readLine();
                String[] parts = str.split(" ");
                if (parts.length > 0) {
                    parts[0] = "god";
                }
                String result = String.join("", parts);
                bw.write(result);
                bw.newLine();
            }
            bw.flush();
            bw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
