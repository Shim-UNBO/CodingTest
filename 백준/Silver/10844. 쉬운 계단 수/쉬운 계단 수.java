import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cntNum;
        int MOD = 1_000_000_000;
        cntNum = Integer.parseInt(reader.readLine());
        if(cntNum < 1 || cntNum > 100){
            return;
        }
        int[][] dp = new int[cntNum + 1][10];
        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= cntNum; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j - 1 >= 0) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % MOD;
                }
                if (j + 1 <= 9) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j + 1]) % MOD;
                }
            }
        }

        int result = 0;
        for (int i = 0; i <= 9; i++) {
            result = (result + dp[cntNum][i]) % MOD;
        }

        System.out.println(result);
    }
}