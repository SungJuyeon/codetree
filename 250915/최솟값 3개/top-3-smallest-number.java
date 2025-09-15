import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            q.add(sc.nextInt());
            if(q.size() < 3) {
                System.out.println("-1");
                continue;
            }

            int a = q.poll();
            int b = q.poll();
            int c = q.poll();
            System.out.println(a*b*c);
            q.add(a);
            q.add(b);
            q.add(c);

        }


    }
}