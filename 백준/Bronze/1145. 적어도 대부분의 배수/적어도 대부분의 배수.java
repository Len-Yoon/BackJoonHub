import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < 5; i++) {
            arr[i]  = sc.nextInt();
        }

        int N = 1;
        int count = 0;

        while (true) {
            N++;

            for(int i = 0; i < 5; i++) {
                if(N % arr[i] == 0) {
                    count++;
                }
            }

            if(count >= 3) {
                break;
            } else {
                count = 0;
            }
        }

        System.out.println(N);
    }
}