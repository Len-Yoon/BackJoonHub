import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        LinkedList<Integer> queue = new LinkedList<>();

        //1부터 N 순서대로 저장
        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int count = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());

            //num값이 맨 앞에 올때까지 반복
            while(queue.getFirst() != num) {
                if(queue.indexOf(num) <= (queue.size() / 2)) {
                    queue.addLast(queue.getFirst());
                    queue.removeFirst();
                }else {
                    queue.addFirst(queue.getLast());
                    queue.removeLast();
                }
                count++;
            }
            //num값이 맨 앞에 위치시 제외
            if(queue.getFirst() == num) {
                queue.removeFirst();
            }
        }
        
        System.out.println(count);

    }
}