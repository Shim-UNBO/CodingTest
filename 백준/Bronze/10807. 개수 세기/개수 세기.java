import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[] nArray = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int thisNum = Integer.parseInt(br.readLine());
            int cnt =0;
            for(int i = 0; i < nArray.length; i++){
                if(nArray[i]==thisNum){
                    cnt++;
                }
            }
            System.out.print(cnt);
        }
        catch (Exception e){

        }
    }
}
