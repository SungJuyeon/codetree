import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // int sum = 0;
        // double maxAvg = 0;
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // pq.add(arr[n-1]);
        // sum += arr[n-1];

        // for(int i = n-2; i >= 1; i--) {
        //     pq.add(arr[i]);
        //     sum += arr[i];

        //     double avg = (double) (sum - pq.peek()) / (n-i-1);
        //     if(maxAvg < avg) maxAvg = avg;
        // }

        long[] prefix = new long[n+1];
        for(int i = 0; i < n; i++)
            prefix[i+1] = prefix[i] + arr[i];

        int[] suffixMin = new int[n];
        suffixMin[n-1] = arr[n-1];
        for(int i = n-2; i >=1; i--) {
            suffixMin[i] = Math.min(arr[i], suffixMin[i+1]); 
        }

        double maxAvg = 0;
        for(int k = 1; k <= n-2; k++) {
            long totalSum = prefix[n] - prefix[k];
            int minVal = suffixMin[k];
            long sumWithoutMin = totalSum - minVal;
            int size = n-k-1;
            double avg = (double) sumWithoutMin / size;
            maxAvg = Math.max(maxAvg, avg);
        }

        System.out.printf("%.2f", maxAvg);
    }
}