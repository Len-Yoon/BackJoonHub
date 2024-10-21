import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(),",");
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        /** 2 **/
        int[] newArr = Arrays.copyOf(arr, arr.length);
        int arrLength = n-1;

        /** 3 **/
        while(k != 0) {
            int[] moveArr = new int[arrLength];

            // B[i] = A[i+1] - A[i]
            for(int i=0; i<newArr.length-1; i++)
                moveArr[i] = newArr[i+1] - newArr[i];

            arrLength --;
            k --;
            newArr = Arrays.copyOf(moveArr, moveArr.length);
        }

        /** 4 **/
        for(int i=0; i<newArr.length; i++) {
            if(i != newArr.length-1)
                System.out.print(newArr[i]+",");
            else
                System.out.println(newArr[i]);
        }
        br.close();
    }
}