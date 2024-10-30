import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int line = Integer.parseInt(st.nextToken());
            int size = Integer.parseInt(st.nextToken());
            String[] origin = new String[line];
            String[] doubleOrigin = new String[line];
            boolean chcek = false;
            for (int i = 0; i<line; i++){
                origin[i] = br.readLine();
            }
            for (int i = 0; i<line; i++){
                doubleOrigin[i] = br.readLine();
            }
            for (int i = 0; i<line; i++){
                StringBuilder stb = new StringBuilder();
                for (int j=0;j<size; j++){
                    char ch = origin[i].charAt(j);
                    stb.append(ch).append(ch);
                }
                if (stb.toString().equals(doubleOrigin[i])){
                    chcek = true;
                }else {
                    chcek = false;
                    break;
                }
            }
            if (chcek){
                bw.write("Eyfa");
            }else{
                bw.write("Not Eyfa");
            }
            bw.flush();
            bw.close();
            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
