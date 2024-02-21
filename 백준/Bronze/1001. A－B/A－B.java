import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            while(stringTokenizer.hasMoreTokens()){
                int a = Integer.parseInt(stringTokenizer.nextToken());
                int b = Integer.parseInt(stringTokenizer.nextToken());
                System.out.println(a-b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}