import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); //배열 크기
            int[] Aarray = new int[a];
            if ((st = new StringTokenizer(br.readLine())) != null) {
                for (int i = 0; i < a; i++) {
                    Aarray[i] = Integer.parseInt(st.nextToken());
                }
            }
            int[] Barray = new int[a];
            if ((st = new StringTokenizer(br.readLine())) != null) {
                for (int i = 0; i < a; i++) {
                    Barray[i] = Integer.parseInt(st.nextToken());
                }
            }
            System.out.println(sum(a,Aarray,Barray));

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static int sum(int a,int[] Aarray,int[] Barray) {

//        int sum = 0;
//        for (int i =0;i<a;i++){
//            int result=0;
//            int temp=Integer.MIN_VALUE;
//                for(int j=0;j<a;j++){
//                    result = Aarray[i] * Barray[j];
//                    if (j==0){
//                        temp=result;
//                    }
//                    if (result < temp){
//                        temp = result;
//                    }
//
//                }
//
//                sum += temp;
//    }
        Arrays.sort(Aarray); // Aarray를 오름차순으로 정렬
        Arrays.sort(Barray); // Barray를 오름차순으로 정렬

        int sum = 0;
        for (int i = 0; i < a; i++) {
            // Aarray의 i번째 원소와 Barray의 (a-1-i)번째 원소를 곱함
            // 이는 Barray를 내림차순으로 고려하는 것과 같음
            sum += Aarray[i] * Barray[a - 1 - i];
        }
        return sum;
    }
}
