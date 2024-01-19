import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        findMax();
    }

    public static void findMax() {
        try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] num = new int[9][9];
        int n=0,m=0;
        int result = Integer.MIN_VALUE; // 숫자중 최댓값으로 초기화
            for(int i = 0; i < num.length; i++){
                StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
                for(int j = 0; j < 9; j++){
                    num[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                    if(num[i][j] > result){
                        result = num[i][j];
                        n=i+1;m=j+1;
                    }
                }
            }

            System.out.println(result + "\n"+n+" "+m);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}