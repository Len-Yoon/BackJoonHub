import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 100;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i][i] = 0;
        }

        for (int i = 0; i < n; i++) {
            char[] T = br.readLine().toCharArray();

            // 친구인 경우 가중치 1로 설정
            for (int j = 0; j < n; j++) {
                if (T[j] == 'Y') {
                    arr[i][j] = 1;
                }
            }
        }

        // 플로이드워셜
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
                }
            }
        }

        // 가장 유명한 사람의 2-친구의 수
        int answer = 0;

        for (int i = 0; i < n; i++) {
            // i의 2-친구의 수
            int count = 0;
            for (int j = 0; j <n; j++) {
                // 자기 자신은 제외
                if (i == j) continue;
                // 2-친구인 경우
                if (arr[i][j] <= 2) count++;
            }

            answer = Math.max(answer, count);
        }

        System.out.println(answer);
    }


}