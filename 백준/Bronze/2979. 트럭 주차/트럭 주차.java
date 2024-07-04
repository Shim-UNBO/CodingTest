import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int[] fee = new int[3];
    public static StringTokenizer st;

    static {
        try {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 3; i++) {
                fee[i] = Integer.parseInt(st.nextToken());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            int[][] time = new int[3][2];
            for (int i = 0; i < 3; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 2; j++) {
                    time[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            checkTime(time);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void checkTime(int[][] time) {
        int count = 0;
        boolean[] start = new boolean[3];
        boolean[] end = new boolean[3];
        int sum =0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 0; j < 3; j++) {
                if(!start[j] && time[j][0]<=i){
                    count++;
                    start[j] = true;
                }
                if(!end[j]&&time[j][1]<=i){
                    count--;
                    end[j] = true;
                }
            }
            if(count==1){
                sum += fee[0]*count;
            }
            else if(count==2){
                sum += fee[1]*count;
            }
            else if(count==3){
                sum += fee[2]*count;
            }
            if(end[0]&&end[1]&&end[2]){
                System.out.println(sum);
                return;
            }
        }

    }
}
