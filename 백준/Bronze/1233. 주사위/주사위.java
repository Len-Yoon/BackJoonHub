import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        int[] arr = new int[s1 + s2 + s3+1];

        int[] diceSumFrequency = new int[s1 + s2 + s3 + 1];

        // 모든 주사위의 눈을 돌면서 합의 빈도수를 계산
        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    // 주사위 합의 빈도수 증가
                    diceSumFrequency[i + j + k]++;
                }
            }
        }

        int maxFrequency = 0; // 가장 높은 빈도수
        int result = 0; // 결과값을 저장할 변수
        for (int sum = 3; sum <= s1 + s2 + s3; sum++) {
            if (diceSumFrequency[sum] > maxFrequency) {
                // 현재 합의 빈도수가 최댓값보다 크면
                maxFrequency = diceSumFrequency[sum]; // 최댓값 갱신
                result = sum; // 결과값 갱신
            }
        }

            System.out.println(result);
    }
}