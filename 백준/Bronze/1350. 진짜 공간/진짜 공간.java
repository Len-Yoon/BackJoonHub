import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        long cluster = Long.parseLong(br.readLine());

        for (int i = 0; i < N; i++) {
            long file = Long.parseLong(st.nextToken());

            if(file != 0) {
                count += (file/cluster);

                if(file%cluster != 0) {
                    count++;
                }
            }
        }

        System.out.println(cluster*count);
    }
}