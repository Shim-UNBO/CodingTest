import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int[] numbers = new int[3];
            for (int i =0; i<3;i++){
                numbers[i] = Integer.parseInt(br.readLine());
            }
            int n1 = numbers[0];
            int n2 = numbers[1];
            int n3 = numbers[2];
            bw.write(n1+n2-n3+"\n");
            bw.write(Integer.parseInt(String.valueOf(n1)+String.valueOf(n2))-n3+"\n");
            bw.flush();
            bw.close();
            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
