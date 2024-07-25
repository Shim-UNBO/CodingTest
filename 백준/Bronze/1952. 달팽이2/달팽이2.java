import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int i;
        for(i=0;;i++) {
            if(i%2==0){
                M--;
            }
            else
                N--;
            if(M==0 || N==0)
                break;
        }
        System.out.print(i);
    }
}