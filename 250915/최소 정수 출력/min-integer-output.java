import java.util.*;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(x == 0) {
                if(pq.isEmpty()) System.out.println("0");
                else System.out.println(pq.poll());
            } else {
                pq.add(x);
            }
        }
    }
}