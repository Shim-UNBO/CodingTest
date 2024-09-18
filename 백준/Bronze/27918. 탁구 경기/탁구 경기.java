import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());
            int dalgu = 0;
            int phonix = 0;
            int cnt = 0;
            boolean check = true;
            while (check){
               String str = br.readLine();
               if(str.equals("D")){
                   dalgu++;
               }else{
                   phonix++;
               }
               if (Math.abs(dalgu-phonix) == 2){
                   check = false;
               }
               cnt++;
               if (cnt == n){check=false;}
            }
            bw.write(dalgu+":"+phonix);
            bw.flush();
            bw.close();
            br.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
