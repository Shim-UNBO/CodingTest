import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            int n = Integer.parseInt(br.readLine());
            int[] numbers = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (n==2){
                List<Integer> commonDivisors = findCommonDivisors(numbers[0],numbers[1]);
                for (int i : commonDivisors){
                    bw.write(i+"\n");
                }
            }else{
                List<Integer> commonDivisors = findCommonDivisors(numbers);
                for (int i : commonDivisors){
                    bw.write(i+"\n");
                }
            }

            bw.flush();
            bw.close();
            br.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static List<Integer> findCommonDivisors(int a, int b) {
        int gcdValue = gcd(a, b); // 최대공약수 계산
        List<Integer> divisors = new ArrayList<>();
        // 최대공약수의 약수를 구함
        for (int i = 1; i <= gcdValue; i++) {
            if (gcdValue % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }
    // 여러 수의 최대공약수 계산
    public static int gcdOfMultipleNumbers(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcd(result, numbers[i]);
        }
        return result;
    }

    // 공약수 리스트 반환 함수
    public static List<Integer> findCommonDivisors(int[] numbers) {
        int gcdValue = gcdOfMultipleNumbers(numbers); // 여러 수의 최대공약수 계산
        List<Integer> divisors = new ArrayList<>();
        // 최대공약수의 약수를 구함
        for (int i = 1; i <= gcdValue; i++) {
            if (gcdValue % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }


}
