import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int maxResult = 0;

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n - k + 1; i++){
            int output = 0;
            for(int j = i; j < i+k; j++){
                output += arr[j];
            }
            maxResult = Math.max(maxResult, output);
        }
        System.out.print(maxResult);
        sc.close();
    }
}