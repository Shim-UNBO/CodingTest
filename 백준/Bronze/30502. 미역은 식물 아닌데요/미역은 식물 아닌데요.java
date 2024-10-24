import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 위한 BufferedReader와 빠른 출력용 BufferedWriter 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫째 줄 입력 (N: 생물의 종류, M: 실험의 수)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // arr 배열을 -1로 초기화 (0: 광합성 여부, 1: 운동성 여부)
        int[][] arr = new int[N + 1][2];
        for (int i = 1; i <= N; i++) {
            arr[i][0] = arr[i][1] = -1;
        }

        // M번의 실험 결과 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());  // 생물 번호
            String b = st.nextToken();                 // 실험 종류 (P 또는 M)
            int c = Integer.parseInt(st.nextToken());  // 실험 결과 (0 또는 1)

            // 'P'면 광합성 여부 (arr[a][0]), 'M'면 운동성 여부 (arr[a][1])에 저장
            if (b.equals("P")) {
                arr[a][0] = c;
            } else if (b.equals("M")) {
                arr[a][1] = c;
            }
        }

        // 가능한 식물 수의 최소값 (must)와 최대값 (able) 계산
        int must = 0;  // 식물로 반드시 분류되는 생물 수
        int able = 0;  // 식물로 분류될 수 있는 생물 수

        for (int i = 1; i <= N; i++) {
            // 반드시 식물인 경우: 광합성 O, 운동성 X
            if (arr[i][0] == 1 && arr[i][1] == 0) {
                must++;
            }

            // 식물로 분류될 수 있는 경우: 광합성 결과가 0이 아니고 운동성 결과가 1이 아님
            if (arr[i][0] != 0 && arr[i][1] != 1) {
                able++;
            }
        }

        // 결과 출력
        bw.write(must + " " + able);
        bw.flush();
    }
}
