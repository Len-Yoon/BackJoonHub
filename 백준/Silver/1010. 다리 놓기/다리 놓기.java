import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[][] dp = new int[30][30];

        for (int i = 0; i < 30; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
        }

        for(int i=1; i<30; i++){
            for(int j=1; j<=i; j++){
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }
        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            System.out.println(dp[M][N]);
        }

    }
}