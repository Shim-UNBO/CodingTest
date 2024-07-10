import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int width = Integer.parseInt(br.readLine());
            int circle = Integer.parseInt(br.readLine());
            double pi = 3.141592;
            double result = (width*2) + (2*pi*circle);
            System.out.println(result);


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
