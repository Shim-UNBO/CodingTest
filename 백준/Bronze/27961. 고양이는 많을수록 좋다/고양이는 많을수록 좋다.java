import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        try{
            culcuCat();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void culcuCat() throws Exception {
        long n = Long.parseLong(br.readLine());
        int cnt = 0;
        int o = 0;
        while (n > 3) {
            cnt++;
            if(n%2 == 1){
                o=1;
            }else if(n%2 != 1){
                o=0;
            }
            n = n/2 + o;
        }
        System.out.print(cnt + n);
    }
}
