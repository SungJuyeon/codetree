import java.util.*;

class Pair {
    int x, y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int N;
    static char[][] grid;
    static Pair start, end;
    static Map<Integer, Pair> coins = new TreeMap<>(); // 숫자 순서대로

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        grid = new char[N][N];

        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < N; j++) {
                grid[i][j] = line.charAt(j);
                if (grid[i][j] == 'S') start = new Pair(i, j);
                else if (grid[i][j] == 'E') end = new Pair(i, j);
                else if (Character.isDigit(grid[i][j])) {
                    int val = grid[i][j] - '0';
                    coins.put(val, new Pair(i, j));
                }
            }
        }

        int answer = Integer.MAX_VALUE;
        List<Integer> coinNums = new ArrayList<>(coins.keySet());

        for (int len = 3; len <= coinNums.size(); len++) {
            List<Integer> sub = coinNums.subList(0, len);
            List<Pair> path = new ArrayList<>();
            path.add(start);
            for (int coin : sub)
                path.add(coins.get(coin));
            path.add(end);

            int totalDist = 0;
            boolean reachable = true;

            for (int i = 0; i < path.size() - 1; i++) {
                int d = bfs(path.get(i), path.get(i + 1));
                if (d == -1) {
                    reachable = false;
                    break;
                }
                totalDist += d;
            }

            if (reachable) answer = Math.min(answer, totalDist);
        }

        System.out.println(answer == Integer.MAX_VALUE ? -1 : answer);
    }

    // BFS 거리 계산
    public static int bfs(Pair from, Pair to) {
        Queue<Pair> q = new LinkedList<>();
        boolean[][] visited = new boolean[N][N];
        q.add(from);
        visited[from.x][from.y] = true;

        int level = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int s = 0; s < size; s++) {
                Pair curr = q.poll();
                if (curr.x == to.x && curr.y == to.y)
                    return level;

                for (int d = 0; d < 4; d++) {
                    int nx = curr.x + dx[d];
                    int ny = curr.y + dy[d];
                    if (inRange(nx, ny) && !visited[nx][ny] && grid[nx][ny] != '#') {
                        visited[nx][ny] = true;
                        q.add(new Pair(nx, ny));
                    }
                }
            }
            level++;
        }
        return -1;
    }

    public static boolean inRange(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }
}