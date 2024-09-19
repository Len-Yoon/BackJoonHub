import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String str = "";
        if(a < b) {
           str = "<";
        } else if (a > b) {
            str = ">";
        } else {
            str = "==";
        }

        System.out.println(str);
    }
}