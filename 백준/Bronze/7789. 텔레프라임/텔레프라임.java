import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[] nArray = Arrays.stream(br.readLine().split(" "))
                           .mapToInt(Integer::parseInt)
                           .toArray();
            int n = nArray[0];
            int addN = nArray[1];

            boolean x = isPrime(n);
            if (isPrime(n)&&isPrime(Integer.parseInt(addN+String.valueOf(n)))){
                bw.write("Yes");
            }else{
                bw.write("No");
            }
            bw.flush();
            bw.close();
            br.close();


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static boolean isPrime(int n) {
        //true라면 소수
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
