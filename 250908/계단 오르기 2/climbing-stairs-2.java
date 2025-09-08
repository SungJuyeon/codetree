import java.util.Scanner;
public class Main {
    public static int MAXN = 1005;
    public static int n;
    public static int[] coins = new int[MAXN];
    public static int[][] dp = new int[MAXN][5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            coins[i] = sc.nextInt();
        }
        
        dp[1][1] = coins[1];
        dp[2][0] = coins[2];
        dp[2][2] = coins[2] + coins[1];

        for(int i = 3; i <= n; i++) {
            for(int j = 0; j <=3; j++) {
                if(dp[i-2][j] != 0) 
                    dp[i][j] = Math.max(dp[i][j], dp[i-2][j] + coins[i]);
                if(j>0 && dp[i-1][j-1] != 0)
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1] + coins[i]);
            }
        }

        int ans = 0;
        for(int j = 0; j <= 3; j++)
            ans = Math.max(ans, dp[n][j]);
        
        System.out.println(ans);
    }

}