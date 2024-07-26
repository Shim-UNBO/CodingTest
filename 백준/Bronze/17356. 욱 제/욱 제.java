import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken()),k;
            k = 1 / (1 + Math.pow(10, (b - a) / 400));
            System.out.print(k);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
