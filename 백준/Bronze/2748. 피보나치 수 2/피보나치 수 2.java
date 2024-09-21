import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<Integer, Integer> memo = new HashMap<>();
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());
            bw.write(fibonacci(n)+"\n");
            bw.flush();
            bw.close();
            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static long fibonacci(int n) {
        long[] dp = new long[n + 1];
        dp[1] = 1;
        if (n > 1) dp[2] = 1; // 두 번째 항도 1

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // 앞의 두 값을 더한 결과를 저장
        }
        return dp[n];
    }
}
