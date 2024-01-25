import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int testCase = Integer.parseInt(br.readLine());
            for (int i = 0; i < testCase; i++) {
                int arrayNum = Integer.parseInt(br.readLine());
                int[] array = readArray(br, arrayNum);
                int maxSum = findMaxSubarraySum(array);
                System.out.println(maxSum);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int[] readArray(BufferedReader br, int n) throws IOException {
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        return array;
    }


    private static int findMaxSubarraySum(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int i = 0; i < arr.length; i++) {
            maxEndingHere = maxEndingHere + arr[i];
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }
}
