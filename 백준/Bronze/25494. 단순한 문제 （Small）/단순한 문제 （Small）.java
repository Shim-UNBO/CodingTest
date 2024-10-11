import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testCase = Integer.parseInt(br.readLine());

            for (int i =0;i<testCase; i++){
                int[] numbers = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                int a = numbers[0];
                int b = numbers[1];
                int c = numbers[2];
                System.out.println(getCount(a, b, c));
            }
            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static int getCount(int a, int b, int c) {
        int count = 0;
        for (int x = 1; x <= a; x++) {
            for (int y = 1; y <= b; y++) {
                for (int z = 1; z <= c; z++) {
                    if ((x % y == y % z) && (y % z == z % x)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
