import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[][] condo = new int[2][n];
            for (int i=0;i<n;i++){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                condo[0][i] = Integer.parseInt(st.nextToken());
                condo[1][i] = Integer.parseInt(st.nextToken());
            }
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                boolean isCloserAndMoreExpensive = true;
                boolean isCheaperAndFarther = true;

                for (int i = 0; i < n; i++) {
                    if (i == j) continue;

                    // 첫 번째 조건: 바닷가에 더 가까운 콘도는 비용이 더 비싸야 함
                    if (condo[0][i] < condo[0][j] && condo[1][i] <= condo[1][j]) {
                        isCloserAndMoreExpensive = false;
                        break;
                    }
                }

                if (isCloserAndMoreExpensive) {
                    for (int i = 0; i < n; i++) {
                        if (i == j) continue;

                        // 두 번째 조건: 비용이 더 저렴한 콘도는 바닷가에서 더 멀어야 함
                        if (condo[1][i] < condo[1][j] && condo[0][i] <= condo[0][j]) {
                            isCheaperAndFarther = false;
                            break;
                        }
                    }
                }

                if (isCloserAndMoreExpensive && isCheaperAndFarther) {
                    cnt++;
                }
            }
            System.out.println(cnt);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
