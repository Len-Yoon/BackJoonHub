import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader Object 생성
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer Object 생성
        final StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger bg = new BigInteger(st.nextToken(), 2);
        bg = bg.add(new BigInteger(st.nextToken(), 2));

        // 출력
        System.out.print(bg.toString(2));
        // 생성된 BufferedReader 반환
        br.close();
       
    }
}