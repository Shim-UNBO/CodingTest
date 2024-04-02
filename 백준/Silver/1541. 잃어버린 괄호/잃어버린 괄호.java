import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            String[] subParts = input.split("-");
            int minResult = 0;
            for (int i =0; i<subParts.length;i++){
                int temp = 0;
                String[] addParts = subParts[i].split("\\+");
                for (String part : addParts) {
                    temp += Integer.parseInt(part.trim());
                }
                if (i == 0) {
                    minResult = temp;
                } else {
                    minResult -= temp;
                }
            }
            System.out.println(minResult);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
