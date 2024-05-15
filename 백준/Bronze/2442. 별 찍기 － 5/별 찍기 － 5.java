import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(br.readLine());
            for (int i = 0; i<input; i++){
                for (int k=0;k<input-1-i;k++){
                    System.out.print(" ");
                }
                for (int j=0; j<(i+1)*2-1;j++){
                    System.out.print("*");
                }
                // 1 3 5 7 9
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
