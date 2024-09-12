import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[26];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int a = name.charAt(0) - 97;
            arr[a]++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i <arr.length; i++) {
            if(arr[i] >= 5) {
                sb.append((char) (i+97));
            }
        }

        if(sb.length() == 0) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(sb);
        }
    }
}