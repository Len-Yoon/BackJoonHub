import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner br = new Scanner(System.in);

        int n = br.nextInt();

        int M = 0;

        int Y = 0;

        for(int i = 0; i < n; i++) {
            int a = br.nextInt();

            Y += ((a/30)+1)*10;
            M += ((a/60)+1)*15;


        }

        br.close();

        if(Y<M) {
            System.out.println("Y " + Y);
        } else if(Y>M) {
            System.out.println("M " + M);
        } else if(Y==M) {
            System.out.println("Y M " + Y);
        }
    }
}