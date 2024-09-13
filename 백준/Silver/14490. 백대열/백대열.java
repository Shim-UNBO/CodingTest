import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int[] numbers = Arrays.stream(br.readLine().split(":"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int a = numbers[0];
            int b = numbers[1];
            while ( b!=0 ){
                int temp = b;
                b = a % b;
                a = temp;
            }
            bw.write((numbers[0]/a)+":"+numbers[1]/a);
            bw.flush();
            bw.close();
            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
