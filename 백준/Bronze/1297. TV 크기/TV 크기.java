import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();
        int H = sc.nextInt();
        int W = sc.nextInt();

        double length = Math.sqrt((double) D*D / (H*H+W*W));

        String ans = (int)Math.floor(length*H) + " " + (int)Math.floor(length*W);
        System.out.println(ans);
    }
}