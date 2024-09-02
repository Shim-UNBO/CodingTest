import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String line;
            int sum = 0;
            ArrayList<Integer> nArray = new ArrayList<>();
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                nArray.add(Integer.parseInt(line));
            }
            for (int i =1;i<nArray.size();i++){
                sum += nArray.get(i);
            }
            bw.write((nArray.get(0)-sum)+"\n");
            bw.flush();
            bw.close();
            br.close();


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
