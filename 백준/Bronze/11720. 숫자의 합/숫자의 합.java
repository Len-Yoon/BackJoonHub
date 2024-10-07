import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String sNum = sc.next();

        char[] sArr = sNum.toCharArray();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += sArr[i] - '0'; //아스키 코드 (문자열과 숫자 차이)
        }

        System.out.println(sum);
    }
}