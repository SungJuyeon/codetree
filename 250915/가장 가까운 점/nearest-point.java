import java.util.*;

class Pair implements Comparable<Pair> {
    int x, y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair p) {
        int d1 = this.x + this.y;
        int d2 = p.x + p.y;

        if(d2 != d1){
            return d1 - d2;
        }
        if(this.x != p.x) {
            return this.x - p.x;
        }
        return this.y - p.y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Pair[] dots = new Pair[n];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            pq.add(new Pair(x,y));
        }

        for(int i = 0; i < m; i++) {
            Pair besP = pq.poll();
            besP.x += 2; 
            besP.y += 2;
            pq.add(besP);
        }

        Pair p = pq.peek();
        System.out.println(p.x + " " + p.y);
    }
}