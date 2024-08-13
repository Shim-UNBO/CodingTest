import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String num1 = br.readLine();
            String num2 = br.readLine();
            StringBuilder numLove = new StringBuilder();

            for(int i = 0; i<num1.length();i++){
                numLove.append(num1.charAt(i));
                numLove.append(num2.charAt(i));
            }
            while(numLove.length() > 2){
                StringBuilder numLove2 = new StringBuilder();
                for (int i = 1; i<numLove.length(); i++){
                    int num = Integer.parseInt(String.valueOf(numLove.charAt(i-1)))+Integer.parseInt(String.valueOf(numLove.charAt(i)));
                    numLove2.append(num%10);
                }
                numLove = numLove2;
            }
            System.out.println(numLove);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
