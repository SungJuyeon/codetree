import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            String cmd = sc.next();
            if(cmd.equals("push_front")) {
                int c = sc.nextInt();
                dq.addFirst(c);
            }
            else if (cmd.equals("push_back")) {
                int c = sc.nextInt();
                dq.addLast(c);
            }
            else if (cmd.equals("pop_front")) {
                System.out.println(dq.pollFirst());
            }
            else if (cmd.equals("pop_back")) {
                System.out.println(dq.pollLast());
            }
            else if (cmd.equals("size")) {
                System.out.println(dq.size());
            }
            else if (cmd.equals("empty")) {
                if(dq.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
            else if (cmd.equals("front")) {
                System.out.println(dq.peekFirst());
            }
            else if (cmd.equals("back")) {
                System.out.println(dq.peekLast());
            }
        }
    }
}