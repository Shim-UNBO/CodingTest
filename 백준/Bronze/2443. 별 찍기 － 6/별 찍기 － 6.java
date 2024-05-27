import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(br.readLine());
            for (int i = 0; i<input; i++){
                for (int k=0;k<i;k++){
                    System.out.print(" ");
                }
                for (int j=0; j<input*2-1-(i*2);j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
