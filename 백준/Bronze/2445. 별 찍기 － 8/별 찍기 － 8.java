import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        try { 
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(br.readLine());
            for (int i = 0; i<input; i++){
                for (int k=0;k<i+1;k++){
                    System.out.print("*");
                }
                for (int j=0; j<input*2-2-(i*2);j++){
                    System.out.print(" ");
                }
                for (int k=0;k<i+1;k++){
                    System.out.print("*");
                }

                System.out.println(" ");
            }
            for (int i = 0; i<input; i++){
                for (int k=0;k<input-1-i;k++){
                    System.out.print("*");
                }
                for (int j=0; j < (i+1)*2;j++){
                        System.out.print(" ");
                }
                for (int k=0;k<input-1-i;k++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
