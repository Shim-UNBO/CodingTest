import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [][] input = new String[5][15];
        for (int i = 0; i < input.length; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length() && j < 15; j++) {
                input[i][j] = String.valueOf(line.charAt(j));
            }
        }
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < input.length; i++) {
                if (input[i][j] != null) {
                    System.out.print(input[i][j]);
                }
            }
        }
        
    }

    }



