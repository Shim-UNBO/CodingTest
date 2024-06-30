import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        try{
            int cnt = Integer.parseInt(br.readLine());
            getArray(cnt);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void getArray(int n) {
        try {
            int[][] numArray = new int[n][2];;
            for (int i=0;i<n;i++){
                String[] input = br.readLine().split(" ");
                numArray[i][0] = Integer.parseInt(input[0]);
                numArray[i][1] = Integer.parseInt(input[1]);
            }
            setResert(numArray);
        }
        catch (Exception e){

        }

    }
    public static void setResert(int[][] array) {
        for (int i=0;i<array.length;i++){
            int n = array[i][0];
            int r = array[i][1];
            int gcd = gcd(n,r);
            int lcm = lcm(n, r, gcd);
            getResert(lcm,gcd);
        }
    }

    public static void getResert(int lcm,int gcd) {
        System.out.println(lcm+" "+gcd);
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
