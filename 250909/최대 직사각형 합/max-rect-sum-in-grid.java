import java.util.Scanner;
public class Main {
    public static int[][] sum;
    public static int[][] grid;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n+1][n+1];
        sum = new int[n+1][n+1];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        
        int ans = -1000;
        for (int i = 0; i < n; i++) {
            int[] col = new int[n];
            for (int j = i; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    col[k] += grid[j][k];
                }
                ans = Math.max(ans, getSum(col));
            }
        }
        System.out.println(ans);
    }

    public static int getSum(int[] arr) {
        int maxSum = arr[0];
        int cur = arr[0];

        for(int i = 1; i < arr.length; i++) {
            cur = Math.max(arr[i], cur+arr[i]);
            maxSum = Math.max(maxSum, cur);
        }
        return maxSum;
    }
}