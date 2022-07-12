package Java2;
import java.util.Scanner;

public class Main {
    public String solution(String str){
        String change = "";

        for (char c : str.toCharArray()){
            if (Character.isLowerCase(c)){
                 change += Character.toUpperCase(c);
            } else {
                change += Character.toLowerCase(c);
            }
        }

        return change;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String  input = in.next();

        System.out.println(T.solution(input));
    }
}
