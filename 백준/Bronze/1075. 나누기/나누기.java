import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int f = in.nextInt();

        n = (n/100)*100;

        while(n%f != 0) {
            n++;
        }

        if(n < 10) {
            System.out.println("0"+n);
        } else {
            String str = Integer.toString(n);
            
            System.out.println(str.substring(str.length()-2));
        }
    }
}