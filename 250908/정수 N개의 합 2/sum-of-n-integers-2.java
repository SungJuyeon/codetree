import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+1];
        int[] arrSum = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        arrSum[0] = arr[0];

        for(int j = 1; j <= n; j++) {
            arrSum[j] = arrSum[j-1] + arr[j];
        }

        int sum = arrSum[0];
        for(int i = 1; i<=n-k; i++) {
            int a = arrSum[i+k] - arrSum[i];
            sum = Math.max(a, sum);
        }


        System.out.println(sum);
    }
}