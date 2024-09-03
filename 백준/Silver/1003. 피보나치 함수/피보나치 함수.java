import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            int[] fibonacci0 = new int[41];
            int[] fibonacci1 = new int[41];

            fibonacci0[0] = 0;
            fibonacci0[1] = 1;
            fibonacci0[0] = 1;
            fibonacci0[1] = 0;
            fibonacci1[0] = 0;
            fibonacci1[1] = 1;
            for(int k = 2; k <= n; k++){
                fibonacci0[k] = fibonacci0[k-1] + fibonacci0[k-2];
                fibonacci1[k] = fibonacci1[k-1] + fibonacci1[k-2];
            }
            System.out.println(fibonacci0[n] + " " + fibonacci1[n]);
        }
    }
}