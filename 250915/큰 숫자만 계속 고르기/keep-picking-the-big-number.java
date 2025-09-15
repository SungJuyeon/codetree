import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            pq.add(-sc.nextInt());
        }
        
        while(M-->0) {
            int maxV = -pq.poll() - 1;
            pq.add(-maxV);
        }

        System.out.println(-pq.peek());
    }
}