import java.util.Scanner;
import java.util.ArrayList;

class Pair {
    int x, y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    static int N;
    public static int m = 3;
    static char[][] grid;
    static ArrayList<Pair> coinPos = new ArrayList<>();
    static ArrayList<Pair> selectedPos = new ArrayList<>();

    static Pair startPos;
    static Pair endPos;
    public static int ans = INT_MAX;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        grid = new char[N][N];

        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for(int j = 0; j < N; j++) {
                grid[i][j] = line.charAt(j);
                if(grid[i][j] == 'S') startPos = new Pair(i, j);
                else if (grid[i][j] == 'E') endPos = new Pair(i, j);
            }
        }
        
        //동전을 오름차순으로 저장
        for(int num = 1; num <=9; num++) {
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++){
                    if(grid[i][j] == num + '0')
                        coinPos.add(new Pair(i, j));
                }
            }
        }
        findMinMoves(0,0);

        if(ans == INT_MAX) ans = -1;
        System.out.print(ans);
        
    }

    public static void findMinMoves(int curr, int cnt) {
        if(cnt == m) {
            ans = Math.min(ans, calc());
            return;
        }

        if(curr == (int)coinPos.size()) return;
    }

    public static int calc() {
        int moves = dist(startPos, selectedPos.get(0));
        for(int i = 0; i < m - 1; i++)
            moves += dist(selectedPos.get(i), selectedPos.get(i+1));
        moves += dist(selectedPos.get(m-1), endPos);

        return moves;
    }

    public static int dist(Pair a, Pair b) {
        int ax = a.x;
        int ay = a.y;

        int bx = b.x;
        int by = b.y;
        
        return Math.abs(ax - bx) + Math.abs(ay - by);
    }
}