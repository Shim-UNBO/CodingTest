import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine().split("!")[0]);
            bw.write(solve(1,n).toString());

            bw.flush();
            bw.close();
            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static BigInteger solve(int a, int n) {

        BigInteger mul = BigInteger.valueOf(a);

        if(a < n) {
            int b = (a + n) / 2;
            mul = solve(a, b).multiply(solve(b + 1, n));
        }

        return mul;
    }
}

