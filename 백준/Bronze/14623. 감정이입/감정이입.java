import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String binaryA = br.readLine();
            String binaryB = br.readLine();

      
            long decimalNumberA = Long.parseLong(binaryA, 2);
            long decimalNumberB = Long.parseLong(binaryB, 2);

          
            long resultDecimal = decimalNumberA * decimalNumberB;

  
            String resultBinary = Long.toBinaryString(resultDecimal);

        
            System.out.println(resultBinary);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
