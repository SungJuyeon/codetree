import java.util.*;

class Pair {
    int x, y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static int n;
    public static ArrayList<Pair> gPos = new ArrayList<>();
    public static int[][] grid;
    public static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    public static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
    public static boolean[][] visited;
    public static Queue<Pair> q = new LinkedList<> ();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int r1 = sc.nextInt() - 1;
        int c1 = sc.nextInt() - 1;
        int r2 = sc.nextInt() - 1;
        int c2 = sc.nextInt() - 1;
        
        int result = bfs(r1, c1, r2, c2);
        System.out.println(result);
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static int bfs(int sx, int sy, int ex, int ey) {
        Queue<Pair> q = new LinkedList<> ();
        visited = new boolean[n][n];
        grid = new int[n][n];

        q.add(new Pair(sx, sy));
        visited[sx][sy] = true;
        grid[sx][sy] = 0;

        while(!q.isEmpty()) {
            Pair curr = q.poll();
            int x = curr.x, y = curr.y;

            if(x == ex && y == ey) return grid[x][y];

            for(int i = 0; i < 8; i ++) {
                int nx = x + dx[i], ny = y + dy[i];

                if(inRange(nx, ny) && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    grid[nx][ny] = grid[x][y] + 1;
                    q.add(new Pair(nx, ny));
                }
            }
        }

        return -1;
    }
}