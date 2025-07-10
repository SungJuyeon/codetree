import java.util.*;

class Pair{
    int x, y;
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static int n, m;
    public static int[][] grid;
    public static boolean[][] visited;
    public static Queue<Pair> q = new LinkedList<>();
    public static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = sc.nextInt();
        grid = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int[][] starts = new int[k][2];
        for (int i = 0; i < k; i++) {
            starts[i][0] = sc.nextInt() - 1;
            starts[i][1] = sc.nextInt() - 1;
        }
        
        for (int i = 0; i < k; i++) {
            q.add(new Pair(starts[i][0], starts[i][1]));
            BFS(starts[i][0], starts[i][1]);
        }
        System.out.println(answer);
    }

    public static void BFS(int x, int y){
        int[] dx = new int[]{1,0, 0, -1};
        int[] dy = new int[]{0,1, -1, 0};

        while(!q.isEmpty()) {
            Pair curr = q.poll();
            int curr_x = curr.x, curr_y = curr.y;

            for(int i =0; i<4; i++) {
                int newX = curr_x + dx[i];
                int newY = curr_y + dy[i];
                if(canGo(newX, newY)) {
                    q.add(new Pair(newX, newY));
                    answer++;
                    visited[newX][newY] = true;
                }
            }
        }

    }

    public static boolean canGo(int x,  int y){
        return (inRange(x, y) && grid[x][y] == 0 && !visited[x][y]);
    }

    public static boolean inRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n; 
    }                                                                                
}

