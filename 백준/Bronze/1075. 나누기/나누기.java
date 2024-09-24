import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(br.readLine());
            int divisor = Integer.parseInt(br.readLine());
            int baseNum = (number / 100) * 100;
            for (int i = baseNum; i < baseNum + 100; i++) {
                if (i % divisor == 0) {
                    System.out.printf("%02d\n", i % 100);
                    break;
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
