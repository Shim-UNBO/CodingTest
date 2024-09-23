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
            int n = Integer.parseInt(br.readLine());
            int yonsei = 0;
            int korea = 0;
            ArrayList<int[][]> array = new ArrayList<>();
            for (int t = 0; t < n; t++) {
//                int[][] arr = new int[9][2];
                for (int i = 0; i < 9; i++) {
                    String[] input = br.readLine().split(" ");
//                    arr[i][0] = Integer.parseInt(input[0]);
//                    arr[i][1] = Integer.parseInt(input[1]);
                    yonsei += Integer.parseInt(input[0]);
                    korea += Integer.parseInt(input[1]);
                }
                if (yonsei == korea){
                    bw.write("Draw");
                    bw.newLine();
                } else {
                    bw.write(yonsei > korea ? "Yonsei" : "Korea");
                    bw.newLine();
                }
                yonsei =0;
                korea =0;
//                array.add(arr);
            }

            bw.flush();
            bw.close();
            br.close();
//            for (int[][] testCase : array) {
//                for (int i = 0; i < 9; i++) {
//                    System.out.println("[" + testCase[i][0] + ", " + testCase[i][1] + "]");
//                }
//                System.out.println("----");
//            }



        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
