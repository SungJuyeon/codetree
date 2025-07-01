import java.util.*;

public class Main {

    public static List<int[]> bombPositions = new ArrayList<>();
    public static int result = 0;
    public static int n;
    public static boolean[][] visited;
    public static int[][][] bombs = {
        {{0, -2}, {0, -1}, {0, 0}, {0, 1}, {0, 2}},     // 폭탄 1
        {{-1, 0}, {0, 1}, {0, 0}, {0, -1}, {1, 0}},     // 폭탄 2
        {{-1, -1}, {-1, 1}, {0, 0}, {1, -1}, {1, 1}}    // 폭탄 3
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
                if(grid[i][j] == 1) bombPositions.add(new int[]{i, j}); //폭탄 위치
            }
        }
        
        visited = new boolean[n][n];
        backtrack(0);
        System.out.println(result);
        
    }
    
    public static void backtrack(int i){ //각 폭탄마다 폭탄 번호 선택
        if(i == bombPositions.size()) {
            result = Math.max(result, count());
            return;
        }

        int[] pos = bombPositions.get(i);
        int y = pos[0];
        int x = pos[1];
        
        for(int b = 0; b < 3; b++) {
            List<int[]> changed = new ArrayList<>();

            for(int[] d: bombs[b]){
                int ny = y + d[1];
                int nx = x + d[0];
                if (ny >= 0 && ny < n && nx >= 0 && nx < n && !visited[ny][nx]){
                    visited[ny][nx] = true;
                    changed.add(new int[]{ny, nx});
                }
            }

            backtrack(i + 1);
            for(int[] c: changed) {
                visited[c[0]][c[1]] = false;
            }
        }
    }

    public static int count() {
        int cnt = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                if(visited[i][j]) cnt++;
        return cnt;
    }
}

