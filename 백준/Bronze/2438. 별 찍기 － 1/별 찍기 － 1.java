import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(br.readLine());
            for (int i = 0; i<input; i++){
                for (int j=0; j<i+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}