import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String line;
            while (!(line = br.readLine()).equals("0 0 0 0")) {
                int[] numbers = Arrays.stream(line.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                int cnt = 1;
                boolean chk = false;
                if (!(numbers[0] == numbers[1] && numbers[1] == numbers[2] && numbers[2] == numbers[3])) {
                    while (!chk) {
                        int[] numCheck = {
                                Math.abs(numbers[0] - numbers[1]),
                                Math.abs(numbers[1] - numbers[2]),
                                Math.abs(numbers[2] - numbers[3]),
                                Math.abs(numbers[3] - numbers[0])
                        };

                        if (numCheck[0] == numCheck[1] && numCheck[1] == numCheck[2] && numCheck[2] == numCheck[3]) {
                            chk = true;
                            bw.write(cnt + "\n");
                            bw.flush();
                        } else {
                            numbers[0] = numCheck[0];
                            numbers[1] = numCheck[1];
                            numbers[2] = numCheck[2];
                            numbers[3] = numCheck[3];
                            cnt++;
                        }
                    }
                }else{
                    bw.write(cnt-1+"\n");
                    bw.flush();
                }
            }
            bw.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
