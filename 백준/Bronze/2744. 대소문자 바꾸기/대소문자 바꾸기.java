import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String str = br.readLine();
            StringBuilder swap = new StringBuilder();
            for(char c : str.toCharArray()){
                if (Character.isUpperCase(c)) {
                    swap.append(Character.toLowerCase(c));
                } else if (Character.isLowerCase(c)) {
                    swap.append(Character.toUpperCase(c));
                } else {
                    swap.append(c);
                }
            }
            bw.write(swap.toString());
            bw.flush();
            bw.close();
            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
