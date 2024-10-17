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
            ArrayList<Integer> arr = new ArrayList<>();
            String input;

            // 입력 값을 받아 리스트에 추가
            while ((input = br.readLine()) != null && !input.isEmpty()) {
                arr.add(Integer.parseInt(input));
            }
            int temp = arr.get(arr.size()-1);
            int cnt =1;
            for (int i=arr.size()-1; i>=1;i--){
                if (temp < arr.get(i)){
                    temp = arr.get(i);
                    cnt++;
                }
            }
            bw.write(cnt+"");
//            int[] numbers = arr.stream().mapToInt(Integer::intValue).toArray();
//            for (int i : arr){
//                bw.write(i+"\n");
//            }
            bw.flush();
            bw.close();
            br.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
