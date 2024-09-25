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
            int[][] points = new int[3][2];
            
            for (int i = 0; i < 3; i++) {
                points[i] = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            }
            int x = 0, y = 0;

            if (points[0][0] == points[1][0]) {
                x = points[2][0];
            } else if (points[0][0] == points[2][0]) {
                x = points[1][0];
            } else {
                x = points[0][0];
            }

            if (points[0][1] == points[1][1]) {
                y = points[2][1];
            } else if (points[0][1] == points[2][1]) {
                y = points[1][1];
            } else {
                y = points[0][1];
            }

            System.out.println(x + " " + y);
            bw.flush();
            bw.close();
            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
