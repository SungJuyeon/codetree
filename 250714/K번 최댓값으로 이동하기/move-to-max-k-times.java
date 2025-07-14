import java.util.*;

class Pair {
    int x, y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static int n, k;
    public static int[][] grid;
    public static boolean[][] visited;
    public static Pair curr;
    public static Queue<Pair> q = new LinkedList<>();

    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static boolean canGo(int x , int y, int n) {
        return inRange(x, y) && !visited[x][y] && grid[x][y] < n;
    }

    public static void init() {
        for(int i = 0; i < n; i ++)
            for(int j = 0; j < n; j++)
                visited[i][j] = false;
    }
    
    public static void bfs() {
        int[] dx = new int[]{0, 0, 1, -1};
        int[] dy = new int[]{1, -1, 0, 0};

        int cX = curr.x;
        int cY = curr.y;
        visited[cX][cY] = true;
        q.add(curr);

        int num = grid[cX][cY];

        while(!q.isEmpty()) {
            Pair currP = q.poll();
            int currX = currP.x;
            int currY = currP.y;

            for(int i = 0; i < 4; i++){
                int newX = currX + dx[i];
                int newY = currY + dy[i];

                if(canGo(newX, newY, num)){
                    q.add(new Pair(newX, newY));
                    visited[newX][newY] = true;
                }
            }
        }

    }
    public static boolean update(Pair maxP, Pair newP){
        if(maxP.x == -1 && maxP.y == -1) return true;
        int currGrid = grid[maxP.x][maxP.y];
        int newGrid = grid[newP.x][newP.y];

        //값이 더 큰 경우
        if (newGrid != currGrid) return newGrid > currGrid;

        //행이 더 작은 경우
        if(newP.x != maxP.x) return newP.x < maxP.x;

        //열이 더 작은 경우
        return newP.y < maxP.y;
    }

    public static boolean move() {
        //우선순위가 높은 위치를 찾아서 이동한다.
        init();
        bfs();

        Pair maxPos = new Pair(-1, -1);
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++) {
                if(!visited[i][j] || i ==curr.x && j == curr.y) continue;

                Pair newP = new Pair(i, j);
                if(update(maxPos, newP))
                    maxPos = newP;
            }

        if(maxPos.x == -1 && maxPos.y == -1) return false;
        else { 
            curr = maxPos;
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        grid = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int x = sc.nextInt() - 1;
        int y = sc.nextInt() - 1;

        curr = new Pair(x, y);

        while(k-- > 0) {
            boolean isMoved = move();

            if(!isMoved) break;
        }

        int ansX = curr.x;
        int ansY = curr.y;

        System.out.print((ansX + 1) + " " + (ansY+1));
    }
}