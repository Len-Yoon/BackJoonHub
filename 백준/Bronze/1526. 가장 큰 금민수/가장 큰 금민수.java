import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        for( long i = n; n >= 4; i--) {
            boolean flag = true;
            long result = i;

            while (result != 0) {
                if(result % 10 == 4 || result % 10 == 7) {
                    result /= 10;
                } else {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}