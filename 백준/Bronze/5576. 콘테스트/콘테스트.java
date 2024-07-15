import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[] wNum = new int[10];
            int[] kNum = new int[10];
            for (int i = 0; i < 10; i++) {
                wNum[i] = Integer.parseInt(br.readLine());
            }
            for (int i = 0; i < 10; i++) {
                kNum[i] = Integer.parseInt(br.readLine());
            }
            sort(wNum);
            sort(kNum);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void sort(int[] num) {
        Integer[] wNumInteger = Arrays.stream(num).boxed().toArray(Integer[]::new);
        Arrays.sort(wNumInteger, Collections.reverseOrder());
        num = Arrays.stream(wNumInteger).mapToInt(Integer::intValue).toArray();
        sumAndPrint(num);
    }

    public static void sumAndPrint(int[] array) {
        int sum=0;
        for (int i = 0; i<3; i++){
            sum += array[i];
        }
        System.out.print(sum+" ");
    }
}
