import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i< n; i++){  // i=0) a[0]*0 a[1]*1 ... i=1) a[0]*1 a[1]*0 a[2]*1
            int newSum = 0;
            for(int j=0; j<n; j++){
                newSum += (a[j] * Math.abs(j-i));
            }
            minSum = Math.min(minSum, newSum);
        }
        System.out.println(minSum);
        sc.close();
    }
}