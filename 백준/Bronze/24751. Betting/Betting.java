import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int a = Integer.parseInt(br.readLine());
            double ratio1 = 100.0 / a;
            double ratio2 = 100.0 / (100-a);
            System.out.printf("%.3f%n%.3f", ratio1, ratio2);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
