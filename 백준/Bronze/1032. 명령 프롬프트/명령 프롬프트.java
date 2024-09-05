import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n]; //이름 저장하는 배열

        for(int i = 0; i < n; i++) {
            arr[i] = br.readLine(); //이름 배열에 저장
        }

        int length = arr[0].length();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < length; i++) {
            boolean flag = true;
            char c = arr[0].charAt(i);

            for(int j = 1; j < n; j++) {
                if(c != arr[j].charAt(i)) {
                    flag = false;
                }
            }
            
            if(flag) {
                sb.append(c);
            } else {
                sb.append('?');
            }
        }
        
        System.out.println(sb);
    }
}