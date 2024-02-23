import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 표의 크기
            int M = Integer.parseInt(st.nextToken()); // 쿼리의 개수

            int[][] array = new int[N + 1][N + 1]; // 원본 배열
            int[][] sumArray = new int[N + 1][N + 1]; // 누적 합 배열

            // 배열에 값 입력 및 누적 합 계산
            for (int i = 1; i <= N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= N; j++) {
                    array[i][j] = Integer.parseInt(st.nextToken());
                    // 누적 합 계산
                    sumArray[i][j] = sumArray[i][j - 1] + sumArray[i - 1][j] - sumArray[i - 1][j - 1] + array[i][j];
                }
            }

            // 쿼리 처리
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int x1 = Integer.parseInt(st.nextToken());
                int y1 = Integer.parseInt(st.nextToken());
                int x2 = Integer.parseInt(st.nextToken());
                int y2 = Integer.parseInt(st.nextToken());

                // 구간 합 계산
                int sum = sumArray[x2][y2] - sumArray[x1 - 1][y2] - sumArray[x2][y1 - 1] + sumArray[x1 - 1][y1 - 1];
                System.out.println(sum);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}