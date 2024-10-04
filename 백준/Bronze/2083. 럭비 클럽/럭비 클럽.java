import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String line;
            while(!(line = br.readLine()).equals("# 0 0")){
                String[] str = line.split(" ");
                if (Integer.parseInt(str[1]) > 17){
                    bw.write(str[0]+" "+"Senior");
                    bw.newLine();
                }
                else if (Integer.parseInt(str[2]) >= 80 ){
                    bw.write(str[0]+" "+"Senior");
                    bw.newLine();
                }else{
                    bw.write(str[0]+" "+"Junior");
                    bw.newLine();
                }
                bw.flush();
            }
            bw.close();
            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
