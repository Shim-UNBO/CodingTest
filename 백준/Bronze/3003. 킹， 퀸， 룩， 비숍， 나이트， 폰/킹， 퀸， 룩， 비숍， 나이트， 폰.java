import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
chess();
    }
    public static void chess(){
        ArrayList<Integer> scan = new ArrayList();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 5; i++)
        {
            scan.add(sc.nextInt());

        }
        int[] anser = new int[scan.size()];

        for(int i=0;i < scan.size();i++){
            //킹,퀸 작업
            if(i < 2) {
                if (anser[i] != 1) {
                    anser[i]=1-scan.get(i);
                }
            }
            //룩,비숍,나이트 작업
            if(1<i&&i<5){
                if (anser[i] != 1) {
                    anser[i]=2-scan.get(i);
                }
            }
            //폰 작업
            if(i==5){
                if (anser[i] != 1) {
                    anser[i]=8-scan.get(i);
                }
            }
        }
        for(int i=0; i<anser.length; i++){
            System.out.print(anser[i] + " ");
        }
    }
}
