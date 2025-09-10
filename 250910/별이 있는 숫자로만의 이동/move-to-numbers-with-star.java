import java.util.Scanner;

public class Main {
    public static int[][] grid;
    public static int[][] s;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        grid = new int[n+1][n+1];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                grid[i][j] = sc.nextInt();

        s = new int[n+1][n+1];
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                s[i][j] = s[i][j-1] + grid[i][j];
            }
        }
        
        int ans = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++) {
                int sum = 0;
                for(int r = i-k; r <= i+k; r++) {
                    int c = k - Math.abs(i-r);
                    if(r >= 1 && r <= n) {
                        sum += s[r][Math.min(j+c, n)] - s[r][Math.max(j-c-1,0)];
                    }
                }
                ans = Math.max(ans, sum);
            }
        }
        System.out.println(ans);
    }
}