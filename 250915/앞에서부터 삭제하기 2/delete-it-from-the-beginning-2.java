import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        double maxAvg = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        pq.add(arr[n-1]);
        sum += arr[n-1];

        for(int i = n-2; i >= 1; i--) {
            pq.add(arr[i]);
            sum += arr[i];

            double avg = (double) (sum - pq.peek()) / (n-i-1);
            if(maxAvg < avg) maxAvg = avg;
        }

        System.out.printf("%.2f", maxAvg);

    }
}