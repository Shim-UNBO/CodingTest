import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] str = br.readLine().split(" ");
            long n1 = Long.parseLong(str[0]);
            long n2 = Long.parseLong(str[1]);
            System.out.print(n1 * n2 / 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
