import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(),":");

        int[] arr = new int[3];

        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());

        int count = 0;

        for(int h = 0; h < 3; h++) {
            for (int m = 0; m < 3; m++) {
                for(int s = 0; s < 3; s++) {
                    if (h == m || m == s || h == s) continue;
                    if (arr[h] > 0 && arr[h] < 13 && arr[m] < 60 && arr[s] < 60) count++;
                }
            }
        }

        System.out.println(count);
    }
}