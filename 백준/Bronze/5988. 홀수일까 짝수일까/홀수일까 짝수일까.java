import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(br.readLine());
            for (int i=0; i<n;i++){
                evenOrOdd();
            }
            br.close();
            bw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    private static void evenOrOdd() throws Exception{
        BigInteger bigInteger = new BigInteger(br.readLine());
        BigInteger lastDigit = bigInteger.mod(BigInteger.TEN);
        if (lastDigit.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
            bw.write("even");
            bw.newLine();
        } else {
            bw.write("odd");
            bw.newLine();
        }
        bw.flush();
    }
}
