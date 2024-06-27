import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;


public class Main {

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int size = Integer.parseInt(br.readLine());
        System.out.print(solution(size));
    }

    private static String solution(int size) {
        StringBuilder ans = new StringBuilder();
        StringBuilder line = new StringBuilder().append("*".repeat(size)).append("\n");

        IntStream.range(0, size).forEach(i -> ans.append(line));

        ans.setLength(ans.length() - 1);
        return ans.toString();
    }
}