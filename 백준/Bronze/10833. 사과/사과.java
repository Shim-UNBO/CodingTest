import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            ArrayList<int[]> nArray = new ArrayList<>();


            for (int i = 0; i < n; i++) {
                String line = br.readLine();
                StringTokenizer st = new StringTokenizer(line);

                int[] intArray = new int[2];
                intArray[0] = Integer.parseInt(st.nextToken());
                intArray[1] = Integer.parseInt(st.nextToken());
                nArray.add(intArray);
            }

            for (int i = 0; i < nArray.size(); i++) {
                int[] array = nArray.get(i);
                sum += solve(array);
            }
            bw.write(sum+"\n");
            bw.flush();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
// 5
//24 52
//13 22
//5 53
//23 10
//7 70
    private static int solve(int[] array) throws IOException {
        int studentNum = array[0];
        int apple = array[1];
        int result = 0;
        if (apple < studentNum){
            result = apple;
            return result;
        }else if(apple==studentNum){
            return result;
        }
        while((apple - studentNum) >= studentNum){
            apple -= studentNum;
        }
        if (apple >= studentNum){
            apple -= studentNum;
        }
        result = apple;
        return result;
    }


}
