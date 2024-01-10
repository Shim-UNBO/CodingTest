import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)  {
       lotto();
    }

    public static void lotto() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int testCase = Integer.parseInt(br.readLine());
            while (testCase --> 0) {
                StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
                int cnt,maxNum;
                cnt = Integer.parseInt(stringTokenizer.nextToken());
                maxNum = Integer.parseInt(stringTokenizer.nextToken());
                System.out.println(countLottoCombinations(cnt,maxNum));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static long countLottoCombinations(int N, int M) {
        long[][] dp = new long[N + 1][M + 1];

        for (int i = 0; i < M + 1; i++) {
            dp[0][i] = 1;
        }

        for (int n = 1; n < N + 1; n++) {
            for (int m = 1; m < M + 1; m++) {
                dp[n][m] = dp[n - 1][m / 2] + dp[n][m - 1];
            }
        }

        return dp[N][M];
    }
}


