import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(-sc.nextInt());
        }

        while(pq.size() >= 2) {
            int b1 = -pq.poll();
            int b2 = -pq.poll();
            if(b1 - b2 != 0) {
                pq.add(b2 - b1);
            }
        }
        if(pq.isEmpty()) System.out.println("-1");
        else {
            System.out.println(-pq.poll());
        }
        
    }
}