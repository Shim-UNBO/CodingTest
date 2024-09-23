import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] input = br.readLine().split(" ");
            int apple = Integer.parseInt(input[0]);
            int banana = Integer.parseInt(input[1]);

            // 공약수 리스트 구하기
            ArrayList<Integer> divisors = new ArrayList<>();
            int limit = Math.min(apple, banana);
            for (int i = 1; i <= limit; i++) {
                if (apple % i == 0 && banana % i == 0) {
                    divisors.add(i); // apple과 banana의 공약수
                }
            }

            // 공약수를 큰 순서대로 정렬하기
            Collections.sort(divisors);

            // 결과 출력하기
            for (int divisor : divisors) {
                bw.write(divisor + " " + (apple / divisor) + " " + (banana / divisor));
                bw.newLine();
            }

            bw.flush();
            bw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
