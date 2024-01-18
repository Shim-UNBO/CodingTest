import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        hamburger();
    }
    public static void hamburger() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int bread,patty;
            bread = Integer.parseInt(stringTokenizer.nextToken());
            patty = Integer.parseInt(stringTokenizer.nextToken());
            if(1>bread||100<bread||1>patty||100<patty)
            {return;}
            int cnt = bread/2;
            int result =0;
            for(int i = 0; i < cnt; i++){
                if (patty > 0 || patty !=0){
                    result++;
                    patty--;
                }
            }
            System.out.print(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



