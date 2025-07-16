import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[Math.max(n+1,3)];
        dp[1] = 2;
        dp[2] = 7;

        for(int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] * 3 + 1) % 1000000007; //가로
        }

        System.out.println(dp[n]);

    }
}