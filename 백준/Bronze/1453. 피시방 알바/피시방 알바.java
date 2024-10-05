import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        boolean[] arr = new boolean[101];
        int count = 0;

        for(int i = 0; i < size; i++) {
            int m = sc.nextInt();

            if(arr[m] == true) {
                count++;
            } else {
                arr[m] = true;
            }
        }

        System.out.println(count);
    }
}