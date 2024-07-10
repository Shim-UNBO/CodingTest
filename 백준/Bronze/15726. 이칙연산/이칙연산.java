import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] str = br.readLine().split(" ");
            double n1 = Double.parseDouble(str[0]);
            double n2 = Double.parseDouble(str[1]);
            double n3 = Double.parseDouble(str[2]);

            double result1 = (n1 * n2) / n3;
            double result2 = (n1 / n2) * n3;

            double maxResult = Math.max(result1, result2);

            int result = (int) Math.floor(maxResult);

            System.out.print(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
