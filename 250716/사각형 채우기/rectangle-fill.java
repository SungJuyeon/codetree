import java.util.Scanner;
public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //세로 크기 = n, 가로 크기 = 2로 고정
        
        System.out.print(b(n));
        
    }
    public static int b(int n) {
        if(n < 1) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}