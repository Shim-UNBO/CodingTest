import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int day = Integer.parseInt(br.readLine());
            int[] carNum = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
            int cnt = 0;
            for (int i = 0; i<carNum.length; i++){
                if (carNum[i] == day){cnt++;}
            }
            System.out.println(cnt);
        }
        catch (Exception e){

        }
    }
}
