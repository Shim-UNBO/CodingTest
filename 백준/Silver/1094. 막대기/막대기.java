import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            String binaryString = Integer.toBinaryString(n);
            int[] binaryArray = new int[binaryString.length()];
            for (int i = 0; i < binaryString.length(); i++) {
                binaryArray[i] = Integer.parseInt(String.valueOf(binaryString.charAt(i)));
            }
            for (int bit : binaryArray) {
                if (bit==1){
                    cnt++;
                }
            }
            System.out.print(cnt);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
