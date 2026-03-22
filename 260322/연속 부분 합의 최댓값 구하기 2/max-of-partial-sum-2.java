import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int cur = coins[0];

        for(int i = 0; i < n; i++) {
            cur = Math.max(cur + coins[i], coins[i]);
            max = Math.max(max, cur);
        }
        System.out.println(max);
    }
}