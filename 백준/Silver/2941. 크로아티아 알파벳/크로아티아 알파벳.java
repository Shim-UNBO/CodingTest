import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        croatia();
    }

  
     public static void croatia(){
        Scanner sc = new Scanner(System.in);
        //"c=","c-","dz=","d-","lj","nj","s=","z="
        String checkWord = sc.next();
        int count = checkWord.length();

        for(int i=0;i<checkWord.length();i++){
            char cro = checkWord.charAt(i);
                if (cro == 'c'&& i != checkWord.length()-1){
                    if(checkWord.charAt(i+1)=='-' || checkWord.charAt(i+1)=='='){
                        count--;
                    }
                }
                if (cro == 'd'&& i != checkWord.length()-2 && i != checkWord.length()-1){
                    if(checkWord.charAt(i+1)=='z' && checkWord.charAt(i+2)=='='){
                        count=count-2;
                        i += 2;
                    }
                }
                if (cro == 'd'&& i != checkWord.length()-1) {
                    if (checkWord.charAt(i + 1) == '-') {
                        count--;
                    }
                }
                if (cro == 'l'&& i != checkWord.length()-1){
                    if(checkWord.charAt(i+1)=='j') {
                        count--;
                        }
                    }
                if (cro == 'n'&& i != checkWord.length()-1){
                    if(checkWord.charAt(i+1)=='j') {
                        count--;
                    }
                }
                if (cro == 's'&& i != checkWord.length()-1){
                    if(checkWord.charAt(i+1)=='=') {
                        count--;
                    }
                }
                if (cro == 'z'&& i != checkWord.length()-1){
                        if(checkWord.charAt(i+1)=='='){
                            count--;
                        }
                }
                
            }
        if(count<1||count>100){
            System.out.println("1이상 100이하 단어를 입력해 주세요");
        }else {
            System.out.println(count);
        }
    }

}