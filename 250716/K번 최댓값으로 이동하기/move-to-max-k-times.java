import java.util.*;

class Pair {
    int x, y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static int n, k;
    public static int[][] grid;
    public static boolean[][] visited;
    public static Pair curr;
    public static Queue<Pair> q = new LinkedList<>();

    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        grid = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        
        int x = sc.nextInt() - 1;
        int y = sc.nextInt() - 1;

        for(int i = 0; i < k; i++){
            Pair max = bfs(x, y);
            if(max == null) break;
            x = max.x;
            y = max.y;
        }

        // 시작점에서 도달할 수 있는 좌표에서
        // 시작점 보다 작은 숫자들로 이동 가능
        // 1. 가장 큰 수
        // 수가 같다면 
        // 2. 행 번호가 작은 곳
        // 3. 열 번호가 작은 곳
        // 이동하지 못하면 그대로 종료
        

        System.out.print((x + 1) + " " + (y+1));
    }

    public static Pair bfs(int x, int y) {
        int[] dx = {0,0,-1,1};
        int[] dy = {1,-1,0,0};

        Queue<Pair> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];

        visited[x][y]  = true;
        q.add(new Pair(x, y));
        
        Pair max = null;
        int currValue = grid[x][y];

        while(!q.isEmpty()) {
            Pair curr = q.poll();
            for(int i = 0; i < 4; i++) {
                int nx = curr.x+dx[i];
                int ny = curr.y+dy[i];

                if(inRange(nx, ny) && (grid[nx][ny] < currValue) && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    q.add(new Pair(nx, ny));

                    if (max == null || grid[nx][ny] > grid[max.x][max.y] ||
                        (grid[nx][ny] == grid[max.x][max.y] && nx < max.x) ||
                        (grid[nx][ny] == grid[max.x][max.y] && nx == max.x && ny < max.y)) {
                        max = new Pair(nx, ny);
                    }
                }
            }
        }
        return max;
    }
}