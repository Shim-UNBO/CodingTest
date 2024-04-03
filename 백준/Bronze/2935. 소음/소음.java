import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String num1Str=br.readLine();
            String operator =br.readLine();
            String num2Str=br.readLine();
            int num1 = num1Str.length()-1;
            int num2 = num2Str.length()-1;

            switch (operator){
                case "+":
                    if(num1Str.length() == num2Str.length()){
                        System.out.println("2"+"0".repeat(num1Str.length()-1));
                    }else {
                        if (num1Str.length() > num2Str.length()){
                            int leng = num1-num2-1;
                            System.out.println("1"+"0".repeat(leng)+"1"+"0".repeat(num2Str.length()-1));
                        }else {
                            int leng2 = num2-num1-1;
                            System.out.println("1"+"0".repeat(leng2)+"1"+"0".repeat(num1Str.length()-1));
                        }
                    }
                    break;
                case "*":
                    int result = num1+num2;
                    System.out.println("1"+"0".repeat(result));
                    break;
                default:
                    break;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
