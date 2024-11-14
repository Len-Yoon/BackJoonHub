import java.io.*;
import java.util.*;


public class Main {
    static int n, m;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        int ans = 0;

        //정사각형 검사
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                ans = Math.max(ans, sqare(i,j));
            }
        }

        if (ans == 0) {
            ans = 1;
        }

        System.out.println(ans);

    }

    private static int sqare(int i, int j) {
        int max = 0;
        for (int k = 1; k < n; k++) {
            if (i + k < n && j + k < m) {
                if (arr[i][j] == arr[i + k][j] && arr[i][j] == arr[i][j + k] && arr[i][j] == arr[i + k][j + k]) {
                    max = Math.max(max, (k + 1) * (k + 1));
                }
            }
        }
        return max;
    }
}