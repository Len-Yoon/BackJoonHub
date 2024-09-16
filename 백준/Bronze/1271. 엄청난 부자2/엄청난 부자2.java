import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner br = new Scanner(System.in);

        BigInteger n = br.nextBigInteger();
        BigInteger m = br.nextBigInteger();

        System.out.println(n.divide(m)+"\n"+n.remainder(m));
    }
}