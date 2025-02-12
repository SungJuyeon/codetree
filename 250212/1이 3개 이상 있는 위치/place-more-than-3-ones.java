import java.util.Scanner;

public class Main {
    public static boolean inRange(int x, int y, int N){
        return (0 <= x && x < N && 0 <= y && y < N);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dx = new int[]{0, 1,  0, -1};
        int[] dy = new int[]{1, 0, -1,  0};

        int N = sc.nextInt();
        int[][] grid = new int[N][N];
        int cnt = 0, result = 0;
        

        for(int i = 0; i<N; i++){
            for(int j = 0; j < N; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i<N; i++){
            for(int j = 0; j < N; j++){
                for(int num = 0; num < 4; num++){
                    int nx = i + dx[num], ny = j + dy[num];
                    if(inRange(nx, ny, N) && grid[nx][ny] == 1){
                        cnt++;
                    }
                }
                if(cnt >= 3) result++;
                cnt = 0;
            }
        }
        System.out.print(result);
        sc.close();
    }
}