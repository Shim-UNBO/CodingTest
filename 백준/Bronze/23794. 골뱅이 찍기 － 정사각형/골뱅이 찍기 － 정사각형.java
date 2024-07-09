import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(br.readLine());
            String str = "@";
            String repeatedStr = str.repeat(n+2);
            System.out.println(repeatedStr);
            String blink=" ";
            String repeatedBlin = blink.repeat(n);
            for (int i =0; i<n; i++){
                System.out.println(str+repeatedBlin+str);
            }
            System.out.print(repeatedStr);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
