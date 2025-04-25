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

        List<Integer> villageList = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    answer = 0;
                    DFS(i,j);
                    villageList.add(answer);
                }
            }
        }
        
        Collections.sort(villageList);
        System.out.println(villageList.size());
        for(int c: villageList){
            System.out.println(c);
        }

    }
    public static void DFS(int x, int y){
        visited[x][y] = true;
        answer++;
        
        for(int i = 0; i < 4; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(isRange(newX, newY) && !visited[newX][newY] && grid[newX][newY] == 1)
                DFS(newX, newY);
        }
    }

    public static boolean isRange(int x, int y){
        if(x < 0 || x >= n) return false;
        if(y < 0 || y >= n) return false;
        return true;
    }

}