import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.nextLine();

            if (s.equals("0")) {
                break;
            }

            int length = s.length()-1+2;

            for(int i =0; i<s.length(); i++){
                if (s.charAt(i) == '1') {
                    length += 2;
                } else if (s.charAt(i) == '0'){
                    length += 4;
                } else {
                    length += 3;
                }
            }

            System.out.println(length);
        }

        sc.close();

    }
}