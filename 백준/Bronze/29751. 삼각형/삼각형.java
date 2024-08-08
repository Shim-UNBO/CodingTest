import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            double[] wh = Arrays.stream(br.readLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            double result = (wh[0]*wh[1])/2;
            System.out.printf("%.1f",result);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
