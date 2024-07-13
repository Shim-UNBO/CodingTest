import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String binaryA = br.readLine();
            String binaryB = br.readLine();
            long decimalNumberA = Long.parseLong(binaryA, 2);
            long decimalNumberB = Long.parseLong(binaryB, 2);
            culcu(decimalNumberA,decimalNumberB);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void culcu(long a,long b) {
        long n = a*b;
        String decimalN= Long.toBinaryString(n);
        System.out.print(decimalN);

    }
}
