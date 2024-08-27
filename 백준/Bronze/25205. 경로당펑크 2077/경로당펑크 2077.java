import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static String[] check = {"q","w","e","r","t","a","s","d","f","g","z","x","c","v"};
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            String name = br.readLine();
            boolean ok = false;
            name.toLowerCase();
            for (int i =0;i<check.length;i++){
                if(check[i].equals(String.valueOf(name.charAt(n-1)))){
                    ok = true;
                }
                if(ok){break;}
            }
            bw.write(ok ? "1"+"\n" : "0"+"\n");
            bw.flush();
            bw.close();
            br.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
