import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            //n = 수의 개수 , m = 합 횟수 , i,j = 구간 , range = 수의 집합 , rangeSum = 합 배열
            int n =0,m=0,sum=0;
            List<Integer> range = new ArrayList<>();
            List<Integer> rangeSum = new ArrayList<>();
            rangeSum.add(0,0);
            if (stringTokenizer.hasMoreTokens()){
                n= Integer.parseInt(stringTokenizer.nextToken());
                m= Integer.parseInt(stringTokenizer.nextToken());
            }
            stringTokenizer = new StringTokenizer(br.readLine());
            for (int k = 0; k < n; k++) {
                if (stringTokenizer.hasMoreTokens()) {
                    range.add(Integer.parseInt(stringTokenizer.nextToken()));
                    sum += range.get(k);
                }
                rangeSum.add(k+1,sum);
            }
            for (int k = 0; k<m;k++){
                stringTokenizer = new StringTokenizer(br.readLine());
                int i = Integer.parseInt(stringTokenizer.nextToken());
                int j = Integer.parseInt(stringTokenizer.nextToken());
                int result =0;
                result = rangeSum.get(j)-rangeSum.get(i-1);
                System.out.println(result);
            }
            
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
