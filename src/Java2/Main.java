package Java2;
import java.util.Scanner;

public class Main {
    public String solution(String str){
       String answer = "";
       for (char x : str.toCharArray()){
           if (Character.isLowerCase(x)) {
               x = Character.toUpperCase(x);
           } else {
               x = Character.toLowerCase(x);
           }
           answer += x;
       }
       return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String  input = in.next();

        System.out.println(T.solution(input));
    }
}
