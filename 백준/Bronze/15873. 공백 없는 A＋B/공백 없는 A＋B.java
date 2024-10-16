import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            String str = br.readLine();
            if (str.length() == 2){
                bw.write(Integer.parseInt(String.valueOf(str.charAt(0)))+Integer.parseInt(String.valueOf(str.charAt(1)))+"");
            }
            else if (str.length()==3){
                if (String.valueOf(str.charAt(2)).equals("0")){
                    bw.write(Integer.parseInt(String.valueOf(str.charAt(0)))+Integer.parseInt(String.valueOf(str.charAt(1))+String.valueOf(str.charAt(2)))+"");
                }else{
                    bw.write(Integer.parseInt(String.valueOf(str.charAt(0))+String.valueOf(str.charAt(1)))+Integer.parseInt(String.valueOf(str.charAt(2)))+"");
                }

            }
            else {
                bw.write(Integer.parseInt(String.valueOf(str.charAt(0))+String.valueOf(str.charAt(1)))+Integer.parseInt(String.valueOf(str.charAt(2))+String.valueOf(str.charAt(3)))+"");
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
