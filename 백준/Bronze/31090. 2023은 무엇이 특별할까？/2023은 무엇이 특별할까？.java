import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String[] nArray = new String[n];
            for(int i = 0; i<nArray.length; i++){
                nArray[i] = br.readLine();
            }
            solution(nArray);
        }
        catch (Exception e){

        }
    }
    public static void solution(String[] year) {
        for(int i = 0; i<year.length; i++){
            int num = Integer.parseInt(year[i].substring(year[i].length()-2));
            int nextYear = Integer.parseInt(year[i])+1;
            if(nextYear%num==0){
                System.out.println("Good");
            }else{
                System.out.println("Bye");
            }
        }
    }
}
