import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        long answer = 0;

        for(int i = 0; i < a.length(); i++){
            for(int j = 0; j < b.length(); j++){
                answer +=  (a.charAt(i) - '0') * (b.charAt(j) - '0');
            }
        }

        System.out.println(answer);
    }
}