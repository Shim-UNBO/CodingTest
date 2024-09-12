import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());
            int[] numbers = new int[n];
            for (int i =0;i<numbers.length; i++){
                numbers[i] = Integer.parseInt(br.readLine());
            }
            for (int i =0;i<numbers.length; i++){
                if(isPowerOfTwo(numbers[i])){
                    bw.write(1+"\n");
                }else{
                    bw.write(0+"\n");
                }
            }
            bw.flush();
            bw.close();
            br.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;  // 음수나 0은 2의 거듭제곱이 될 수 없으므로 false
        while (n % 2 == 0) {       // 2로 계속 나눌 수 있는지 확인
            n /= 2;                // 2로 나눈 값을 n에 저장
        }
        return n == 1;             // 나눠진 후 1이면 2의 거듭제곱, 그렇지 않으면 false
    }
}
