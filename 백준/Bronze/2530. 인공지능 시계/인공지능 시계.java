import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int[] times = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int n = Integer.parseInt(br.readLine());
            int hours = (n / 3600) + times[0];
            int minutes = ((n % 3600) / 60) + times[1];
            int seconds = (n % 60) + times[2];
            if (seconds / 60 >= 1){
                int sumS = seconds /60;
                minutes += sumS;
                seconds = seconds - (60*sumS);
            }
            if (minutes / 60 >= 1){
                int sumM = minutes / 60;
                hours += sumM;
                minutes = minutes - (60*sumM);
            }
            if (hours >= 24){
                int sumH = hours/24;
                hours = hours-(24*sumH);
            }
            bw.write(hours+" "+minutes+" "+seconds );
            bw.flush();
            bw.close();
            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
