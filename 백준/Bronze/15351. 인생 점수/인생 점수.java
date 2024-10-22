import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            int n = Integer.parseInt(br.readLine());
            String[] str = new String[n];
            for (int i=0; i< str.length; i++){
                str[i] = br.readLine();
            }
            for (int i=0; i<str.length; i++){
                int sum = 0;
                for (int j=0; j<str[i].length(); j++){
                    if (str[i].charAt(j) != ' '){
                        sum += str[i].charAt(j) -64;
                    }
                }
                if (sum == 100){
                    bw.write("PERFECT LIFE");
                    bw.newLine();
                }else{
                    bw.write(sum+"");
                    bw.newLine();
                }
            }
            bw.flush();
            bw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
