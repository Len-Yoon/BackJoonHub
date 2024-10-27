import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);


        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            boolean find = false;
            int target = Integer.parseInt(st.nextToken());

            //이진 탐색 시작
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int midi = (start + end) / 2; //중간값 구하기
                int midV = arr[midi];

                if (midV > target) {
                    end = midi - 1;
                } else if (midV < target) {
                    start = midi + 1;
                } else {
                    find = true;
                    break;
                }
            }

            if (find) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

    }
}