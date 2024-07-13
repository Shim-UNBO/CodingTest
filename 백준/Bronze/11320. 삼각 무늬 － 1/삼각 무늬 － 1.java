import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            for (int i = 0; i < t; i++) {
                String[] abStr = br.readLine().split(" ");
                int a = Integer.parseInt(abStr[0]);
                int b = Integer.parseInt(abStr[1]);
                int result = (a / b) * (a / b);
                System.out.println(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
