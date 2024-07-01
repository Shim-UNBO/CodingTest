import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        try {
            int[] array = new int[8];
            for (int i=0; i<array.length; i++){
                array[i] = Integer.parseInt(br.readLine());
            }
            culcu(array);
        }
        catch (Exception e){

        }
    }
    public static void culcu(int[] array) {
        int[] origin = new int[array.length];
        for (int i=0;i<origin.length;i++){
            origin[i] = array[i];
        }
        int n = array.length;
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = array[maxIdx];
            array[maxIdx] = array[i];
            array[i] = temp;
        }
        array = Arrays.copyOf(array, 5);
        for (int j=0;j<5;j++){
            sum += array[j];
        }
        System.out.println(sum);
        getSort(array,origin);
    }
    public static void getSort(int[] top5,int[] origin) {
        int[] rank = new int[origin.length];
        for (int i=0; i<origin.length; i++){
            for (int j=0; j<5; j++){
                if (origin[i] == top5[j]){
                    rank[i]=i+1;
                }
            }
        }
        removeZero(rank);
    }
    public static void removeZero(int[] rank) {
        int[] arrayWithoutZeros = Arrays.stream(rank)
                .filter(num -> num != 0)
                .toArray();
        for (int i=0;i<arrayWithoutZeros.length;i++){
            System.out.print(arrayWithoutZeros[i]+" ");
        }
    }
}
