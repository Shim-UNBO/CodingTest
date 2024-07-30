import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> strList = new ArrayList<>();
            String line;

            while (!(line = br.readLine()).equals("END")) {
                strList.add(line);
            }
            for(int i = 0; i<strList.size(); i++){
                System.out.println(new StringBuilder(strList.get(i)).reverse());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
