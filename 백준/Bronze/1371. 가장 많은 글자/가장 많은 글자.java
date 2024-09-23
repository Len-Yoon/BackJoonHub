import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //scanner 와 유사

        int[] alpha = new int[26];
        int max = 0;
        String input;
        String str = "";

        while ((input = br.readLine()) != null) {
            str += input;
        }

        //알파벳 갯수 저장 및 가장 많이 나온 알파벳의 횟수 저장
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                alpha[str.charAt(i) - 'a']++;

                if (alpha[str.charAt(i) - 'a'] > max) {
                    max = alpha[str.charAt(i) - 'a'];
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            if (max == alpha[i]) {
                System.out.print((char) (i + 'a'));
            }
        }
    }
}