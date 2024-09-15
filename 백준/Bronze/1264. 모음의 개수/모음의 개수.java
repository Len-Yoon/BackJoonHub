import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String S = br.readLine().toLowerCase();

            //카운트
            int count = 0;

            //break
            if(S.equals("#")) {
                break;
            }

            for (int i = 0; i < S.length(); i++){
                if(S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' ||
                        S.charAt(i) == 'o' || S.charAt(i) == 'u') {
                    count++;
                }
            }

            System.out.println(count);

        }
    }
}