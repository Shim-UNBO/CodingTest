import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            int leng = input.length();
            String[] result = new String[leng];
            StringBuilder commonPrefix = new StringBuilder(input);
            for (int i = 0; i<leng; i++){
                result[i] = String.valueOf(commonPrefix);
                commonPrefix.deleteCharAt(0);
            }
            Arrays.sort(result);
            for (int j = 0; j<leng; j++){
                if (j == leng-1){
                    System.out.print(result[j]);
                }else{
                    System.out.println(result[j]);
                }
            }
//            System.out.println(Arrays.toString(result));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
