import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];

        for (int i = 2; i <= N; i++) {   //인덱스값으로 초기화
            arr[i] = i;
        }

        for (int i =2; i <= Math.sqrt(N); i++) { //제곱근 까지만 수행
            if (arr[i] == 0) {
                continue;
            }

            for (int j = i+i; j <= N; j = j+i) { //배수 지우기
                arr[j] = 0;
            }
        }

        for (int i = M; i <= N; i++) {
            if(arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}