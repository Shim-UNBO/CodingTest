import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            ArrayList<Integer> sticks = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            sticks.add(Integer.parseInt(st.nextToken()));
            sticks.add(Integer.parseInt(st.nextToken()));
            sticks.add(Integer.parseInt(st.nextToken()));
            Collections.sort(sticks);
            int stick1 =sticks.get(0);
            int stick2 =sticks.get(1);
            int stick3 =sticks.get(2);
            int sum = 0;
            if (stick1+stick2 <= stick3){
                sticks.remove(2);
                sticks.add(2,stick1+stick2-1);
                for (int i : sticks){
                    sum += i;
                }
            }else{
                sum += stick1+stick2+stick3;
            }
            bw.write(sum+"\n");
            bw.flush();
            bw.close();
            br.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
