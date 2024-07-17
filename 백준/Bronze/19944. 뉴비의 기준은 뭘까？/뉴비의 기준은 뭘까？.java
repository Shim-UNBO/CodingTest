import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            if (1 == m || 2 == m){
                System.out.print("NEWBIE!");
            }else if(n >= m){
                System.out.print("OLDBIE!");
            }else{
                System.out.print("TLE!");
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
