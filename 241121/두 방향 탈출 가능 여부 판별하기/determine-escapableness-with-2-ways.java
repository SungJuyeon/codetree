import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int[][] grid;
    public static int[][] visited;
    
    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static boolean canGo(int x, int y){
        if(!inRange(x,y))
            return false;
        if(visited[x][y] ==1 || grid[x][y] == 0)
            return false;
        return true;
    }

    public static void DFS(int x, int y) {
        // 오른쪽과 아래로만 이동
        int[] dx = {0, 1};
        int[] dy = {1, 0};

        for (int i = 0; i < 2; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (canGo(newX, newY)) {
                visited[newX][newY] = 1;
                DFS(newX, newY);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 줄에서 n과 m 읽기
        n = scanner.nextInt();
        m = scanner.nextInt();

        // 배열 초기화
        grid = new int[n][m];
        visited = new int[n][m];

        // 두 번째 줄부터 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        
        visited[0][0]=1;
        DFS(0, 0);

        // 결과 출력
        if (visited[n - 1][m - 1] == 1) {
            System.out.println(1); // 탈출 가능
        } else {
            System.out.println(0); // 탈출 불가능
        }
    }
}