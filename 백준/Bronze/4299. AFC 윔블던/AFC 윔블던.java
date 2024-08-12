import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int score1 = 0;
            int score2 = 0;
            int[] n = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if ((n[0] + n[1]) % 2 != 0 || n[0] < n[1]) {
                System.out.println(-1);
            }else{
                int temp = n[0]+n[1];
                score1 = temp/2;
                score2 = n[0]-score1;
                System.out.print(score1+" "+ score2);
            }
        }
        catch (Exception e){
        }
    }
}
