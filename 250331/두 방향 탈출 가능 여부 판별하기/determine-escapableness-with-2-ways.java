import java.util.Scanner;
public class Main {
    public static int[] dx = new int[] {1, 0};  //right, down
    public static int[] dy = new int[] {0, 1};
    public static int[][] visited = new int[101][101];
    public static int[][] grid;
    public static boolean answer = false;
    public static int n, m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        
        //grid[0][0] 시작해서 grid[n][n] 까지 연결되어 있어야함. = 가는 길이 모두 1
        DFS(0,0);
        if(answer) System.out.println("1");
        else System.out.println("0");
    }

    public static void DFS(int x, int y){
        if(x == n-1 && y == m-1) {
            answer = true;
            return;
        }
        for(int i = 0; i < 2; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(canGo(newX, newY)){
                visited[newX][newY] = 1;
                DFS(newX, newY);
            }
            
        }
    }

    public static boolean canGo(int x, int y){
        if(!isRange(x, y)) return false;
        if(visited[x][y] == 1 || grid[x][y] == 0) return false;
        return true;
    }

    public static boolean isRange(int x, int y){
        if(x < 0 || x >= n) return false;
        if(y < 0 || y >= m) return false;
        return true;
    }
}