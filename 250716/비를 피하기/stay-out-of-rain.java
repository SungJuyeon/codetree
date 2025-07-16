import java.util.*;

class Pair{
    int x, y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static int n, h, m;
    public static int[][] grid;
    public static int[][] ans;
    // public static ArrayList<Pair> person = new ArrayList<> ();
    // public static ArrayList<Pair> place = new ArrayList<> ();
    // public static Queue<Pair> q = new LinkedList<> ();
    // public static boolean[][] visited;

    public static int[] dx = {0, 0, 1, -1};
    public static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();   //격자 크기
        h = sc.nextInt();   //사람 수
        m = sc.nextInt();   //비를 피할 수 있는 공간의 수
        grid = new int[n][n];
        ans = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2){
                    ans[i][j] = bfs(i, j);
                }
            }

        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int bfs(int cx, int cy) {
        boolean[][] visited = new boolean[n][n];
        Queue<Pair> q = new LinkedList<> ();
        int[][] ans = new int[n][n];

        visited[cx][cy] = true;
        q.add(new Pair(cx, cy));

        while(!q.isEmpty()) {
            Pair curr = q.poll();
            int x= curr.x, y = curr.y;
            
        }

        
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}


        // 0: 이동할 수 있는 곳
        // 1: 벽이 있어 이동할 수 없는 곳
        // 2: 칸에 사람이 서있음
        // 3: 비를 피할 수 있음

        //사람이 있던 칸이 아니면 0 출력
        //사람이 있던 칸이면 비를 피할 수 있는 공간까지 걸리는 최소 시간 
        //해당 위치에 있는 사람이 비를 피할 수 없으면 -1 출력