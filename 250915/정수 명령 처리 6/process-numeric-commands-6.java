import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            String cmd = sc.next();
            if(cmd.equals("push")) {
                int s = sc.nextInt();
                pq.add(-s);
            } else if(cmd.equals("pop")) {
                System.out.println(-pq.poll());
            } else if(cmd.equals("size")) {
                System.out.println(pq.size());
            } else if(cmd.equals("empty")) {
                if(pq.isEmpty()) System.out.println("1");
                else System.out.println("0");
            } else if(cmd.equals("top")) {
                System.out.println(-pq.peek());
            }
        }
    }
}