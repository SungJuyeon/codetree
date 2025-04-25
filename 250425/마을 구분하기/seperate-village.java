import java.util.*;

public class Main {
    public static int[] dx = new int[]{1,-1,0,0}; //우, 좌, 상, 하
    public static int[] dy = new int[]{0,0,1,-1};
    public static int answer = 0;
    public static int n = 0;
    public static boolean[][] visited;
    public static int[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    answer = 0; 
                    DFS(i, j);
                    list.add(answer);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int i : list){
            System.out.println(i);
        }

    }
    public static void DFS(int x, int y){
        visited[x][y] = true;
        answer++;

        for(int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(isRange(nx, ny) && !visited[nx][ny] && grid[nx][ny] ==1) {
                DFS(nx, ny);
            }
        }
    }
    public static boolean isRange(int x, int y){
        return x >= 0 && y >= 0 && x < n && y < n;
    }
}