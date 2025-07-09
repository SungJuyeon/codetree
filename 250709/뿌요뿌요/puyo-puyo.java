import java.util.Scanner;

public class Main {
    public static int[] dx = new int[]{1,-1,0,0}; //우, 좌, 상, 하
    public static int[] dy = new int[]{0,0,1,-1};
    public static int n;
    public static int[][] grid;
    public static int popNum = 0, popBlockNum = 0;
    public static int maxNum = 0, maxBlockNum = 0;
    public static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j <n; j++){
                if(!visited[i][j]) {
                    popNum = grid[i][j];
                    maxNum = 0;
                    DFS(i,j);
                    if(maxNum >= 4) {
                        popBlockNum++;
                    }
                    maxBlockNum = Math.max(maxBlockNum, maxNum);
                }
            }
        }

        System.out.print(popBlockNum + " " + maxBlockNum);
    }

    public static void DFS(int x, int y){
        visited[x][y] = true;
        maxNum++;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(canGo(nx,ny) && grid[nx][ny] == popNum) {
                DFS(nx, ny);
            }

        }

        

    }

    public static boolean canGo(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n && !visited[x][y];
    }
}