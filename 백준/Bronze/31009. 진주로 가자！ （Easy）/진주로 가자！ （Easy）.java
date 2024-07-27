import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            String[][] str = new String[n][2];
            int pee = 0;
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                String line = br.readLine();
                String[] parts = line.split(" ");
                str[i][0] = parts[0];
                str[i][1] = parts[1];
            }

            for (int i = 0; i < n; i++) {
                if (str[i][0].equals("jinju")){
                    pee = Integer.parseInt(str[i][1]);
                    System.out.println(pee);
//                    System.out.println(Arrays.toString(str[i]));
                }
            }
            for (int i = 0; i < n; i++) {
                if (Integer.parseInt(str[i][1])>pee){
                    cnt++;
                }
            }
            System.out.print(cnt);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
