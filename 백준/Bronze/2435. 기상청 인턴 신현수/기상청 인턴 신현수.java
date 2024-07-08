import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] days = br.readLine().split(" ");
            int n = Integer.parseInt(days[0]);
            int k = Integer.parseInt(days[1]);
            int[] temperature = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                if (st.hasMoreTokens()) {
                    temperature[i] = Integer.parseInt(st.nextToken());
                }
            }
//            for (int temp : temperature) {
//                System.out.print(temp + " ");
//            }
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;

            for (int i = 0; i < k; i++) {
                currentSum += temperature[i];
            }
            maxSum = currentSum;

            for (int i = k; i < n; i++) {
                currentSum += temperature[i] - temperature[i - k];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }

            System.out.println(maxSum);


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
