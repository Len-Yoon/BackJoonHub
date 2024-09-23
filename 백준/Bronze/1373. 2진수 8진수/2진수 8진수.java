import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        BigInteger n = new BigInteger(s, 2);

        String ans = n.toString(8);

        System.out.println(ans);
    }
}