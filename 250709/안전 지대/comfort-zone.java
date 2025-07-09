import java.util.*;

public class Main {
    public static boolean[][] visited;
    public static int[][] grid;
    public static int cnt = 0;
    public static int n, m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        
        int maxHeight = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
                maxHeight = Math.max(maxHeight, grid[i][j]);
            }
        }
        int maxSafe = 0;
        int bestK = 0;

        for(int k = 0; k < maxHeight; k++){
            visited = new boolean[n][m];
            int areaCount = 0;
            for(int i = 0; i < n; i++)
                for(int j = 0; j < m; j++)
                    if(!visited[i][j] && grid[i][j] > k) {
                        DFS(i, j, k);
                        areaCount++;
                    }
            if(areaCount >= maxSafe) {
                maxSafe = areaCount;
                if(bestK <= k) bestK = k;
            }
        }

        System.out.println(bestK + " " + maxSafe);

    }
    public static void DFS(int x, int y, int k){
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        visited[x][y] = true;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(isRange(nx, ny) && !visited[nx][ny] && grid[nx][ny] > k){
                DFS(nx, ny, k);
            }
        } 
    }
    public static boolean isRange(int x, int y){
        return x >= 0 && y >= 0 && x < n && y < m;
    }
}