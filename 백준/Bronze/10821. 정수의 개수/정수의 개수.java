import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] str = br.readLine().split(",");
            System.out.print(str.length);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
