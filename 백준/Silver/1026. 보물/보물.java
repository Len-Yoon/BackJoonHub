import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int A[] = new int[n];
        int B[] = new int[n];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A); // A배열 정렬
        Arrays.sort(B); // B배열 정렬

        for(int i=0; i<n; i++) {      // sum에 A배열은 최소값부터
            sum += A[i]*B[n-1-i]; // B배열은 최대값부터 곱해서 더하기
        }
        System.out.println(sum);
    }
}