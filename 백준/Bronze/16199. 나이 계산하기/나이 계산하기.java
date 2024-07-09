import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] hbd = br.readLine().split(" ");
            int[] birthDate = new int[]{Integer.parseInt(hbd[0]), Integer.parseInt(hbd[1]), Integer.parseInt(hbd[2])};
            String[] today = br.readLine().split(" ");
            int[] currentDate = new int[]{Integer.parseInt(today[0]), Integer.parseInt(today[1]), Integer.parseInt(today[2])};

            manAge(birthDate,currentDate);
            seAge(birthDate,currentDate);
            yearAge(birthDate,currentDate);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void manAge(int[] birthDate, int[] currentDate) {
        int bY = birthDate[0];
        int bM = birthDate[1];
        int bD = birthDate[2];
        int cY = currentDate[0];
        int cM = currentDate[1];
        int cD = currentDate[2];

        int age = cY - bY;

        if (cM < bM || (cM == bM && cD < bD)) {
            age--;
        }

        System.out.println(age);
    }

    public static void seAge(int[] birthDate, int[] currentDate) {
        int bY = birthDate[0];
        int cY = currentDate[0];
        System.out.println(cY-bY+1);
    }
    public static void yearAge(int[] birthDate, int[] currentDate) {
        int bY = birthDate[0];
        int cY = currentDate[0];
        System.out.println(cY-bY);
    }
}
