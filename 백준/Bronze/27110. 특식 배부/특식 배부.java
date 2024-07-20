import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int chicKen = Integer.parseInt(br.readLine());
            int[] numbers = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            culcuNum(numbers,chicKen);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void culcuNum(int[] nums,int ck) {
        int sum = 0;
        for (int i=0; i<nums.length; i++){
            if (ck >= nums[i]){
                sum+=nums[i];
            }else{
                sum+=ck;
            }
        }
        System.out.print(sum);
    }
}
