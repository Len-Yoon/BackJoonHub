import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //운동시간
        int m = sc.nextInt(); //낮아지면 안되는 심박수
        int M = sc.nextInt(); //넘으면 안되는 심박수
        int T = sc.nextInt(); //운동하면 높아지는 심박수
        int R = sc.nextInt(); //1분쉬면 낮아지는 심박수

        int count = 0;
        int start = m;

        if((m+T) > M) {
            System.out.println(-1);
        } else {
            while (true) {

                if((m+T) <= M) {
                    m += T;
                    N--;
                } else {
                    m -= R;
                }

                if(m < start) {
                    m = start;
                }

                count++;

                if(N == 0) break;
            }

            System.out.println(count);
        }
    }
}