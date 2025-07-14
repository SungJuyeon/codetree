import java.util.*;
class Pair{
    int x, y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        int[][] cnt = new int[n][m];
        Queue<Pair> q = new LinkedList<> ();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        
        q.add(new Pair(0,0));
        visited[0][0] = true;
        cnt[0][0]++;

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        while(!q.isEmpty()) {
            Pair curr = q.poll();
            int x = curr.x, y = curr.y;

            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if(!visited[nx][ny] && grid[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        cnt[nx][ny] = cnt[x][y] + 1;
                        q.add(new Pair(nx, ny));
                    }
                }
            }
        }
        if(visited[n-1][m-1]) {
            System.out.print(cnt[n-1][m-1] - 1);
        } else System.out.print("-1");

    
    }
}