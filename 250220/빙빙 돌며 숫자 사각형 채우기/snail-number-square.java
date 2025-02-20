import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int[] dx = {0, 1, 0, -1};  // 우, 하, 좌, 상
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();   // 세로 
        m = sc.nextInt();   // 가로 
        int[][] grid = new int[n][m];

        int x = 0, y = 0, num = 0;

        for (int i = 1; i <= n * m; i++) {
            grid[x][y] = i; 

            int nx = x + dx[num];
            int ny = y + dy[num];

            if (!isRange(nx, ny) || grid[nx][ny] != 0) {
                num = (num + 1) % 4;  // 방향 변경
                nx = x + dx[num];
                ny = y + dy[num];
            }

            // 위치 갱신
            x = nx;
            y = ny;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }
}
