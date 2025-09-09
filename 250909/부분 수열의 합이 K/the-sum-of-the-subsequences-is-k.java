import java.util.Scanner;
public class Main {
    public static int[] arr;
    public static int[] arrSum;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        // for(int i = 0; i < n; i++) {
        //     int sum = 0;
        //     for(int j = i; j < n; j++) {
        //         sum += arr[j];
        //         if(sum == k) {
        //             ans++;
        //             break;
        //         } else if(sum > k) {
        //             break;
        //         }
        //     }
        // }

        arrSum = new int[n+1];
        arrSum[0] = 0;
        for(int i = 1; i <= n; i++) {
            arrSum[i] = arrSum[i-1] + arr[i-1];
        }

        for(int i = 1; i <= n; i++) {
            for(int j = i; j <= n; j++) {
                if(getSum(i,j) == k) ans++;
            }
        }

        System.out.println(ans);
    }

    public static int getSum(int i, int j) {
        return arrSum[j] - arrSum[i-1];
    }
}
