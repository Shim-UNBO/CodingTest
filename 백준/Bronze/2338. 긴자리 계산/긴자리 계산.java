import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BigInteger n1 = new BigInteger(br.readLine());
            BigInteger n2 = new BigInteger(br.readLine());
            BigInteger sum = n1.add(n2);
            BigInteger sub = n1.subtract(n2);
            BigInteger mul = n1.multiply(n2);
            bw.write(sum+"\n");
            bw.write(sub+"\n");
            bw.write(mul+"");
            bw.flush();
            bw.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
