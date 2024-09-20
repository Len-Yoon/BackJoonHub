import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        boolean flag = false;
        
        if(str.length() > 1) {
            for(int i = 0; i < str.length(); i++) {
                int a = 1;
                int b = 1;

                for(int j = 0; j < i; j++) {
                    a *= (str.charAt(j) - '0');
                }

                for(int j = i; j < str.length(); j++) {
                    b *= (str.charAt(j)-'0');
                }

                if(a == b) {
                    flag = true;
                    break;
                }
            }
        }
        
        System.out.println(flag ? "YES" : "NO");

    }
}