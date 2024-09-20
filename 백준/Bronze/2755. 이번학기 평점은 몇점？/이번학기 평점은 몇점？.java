import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<String, Double> gradeMap = new HashMap<>();

    public static void main(String[] args) {
        try{
            gradeMap.put("A+", 4.3);
            gradeMap.put("A0", 4.0);
            gradeMap.put("A-", 3.7);
            gradeMap.put("B+", 3.3);
            gradeMap.put("B0", 3.0);
            gradeMap.put("B-", 2.7);
            gradeMap.put("C+", 2.3);
            gradeMap.put("C0", 2.0);
            gradeMap.put("C-", 1.7);
            gradeMap.put("D+", 1.3);
            gradeMap.put("D0", 1.0);
            gradeMap.put("D-", 0.7);
            gradeMap.put("F", 0.0);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());
            double scoreSum = 0;
            double total = 0;
            for (int i=0;i<n;i++){
                String[] input = br.readLine().split(" ");
                String gradeStr = input[2]; // 성적 ex.A+,C+,F0
                double score = Double.parseDouble(input[1]); // 학점 ex.3,2
                if (gradeMap.containsKey(gradeStr)){
                    total += score * gradeMap.get(gradeStr);
                }
                scoreSum += score;
            }
            String format = String.format("%.2f",total/scoreSum);
            bw.write(format+"\n");
            bw.flush();
            bw.close();
            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
