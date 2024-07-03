import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        try {
            String[] width = br.readLine().split(" ");
            String[] nums = br.readLine().split(" ");
            culcu(width,nums);

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void culcu(String[] width,String[] nums) {
        int people = Integer.parseInt(width[0]) * Integer.parseInt(width[1]);
        int[] term = new int[nums.length];
        for (int i = 0; i<nums.length; i++){
            term[i] = Integer.parseInt(nums[i]) - people;
            System.out.print(term[i]+" ");
        }
    }
}
