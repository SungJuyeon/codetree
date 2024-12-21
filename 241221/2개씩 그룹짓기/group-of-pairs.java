import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] input = new int[N*2];

        for (int i = 0; i < N*2; i++) {
            input[i] = sc.nextInt();
        }
        
        Arrays.sort(input);
        int max=0;
        for(int i=0; i<N; i++){
            int sum = input[i] + input[N*2-i-1];
            max = Math.max(max, sum);
        }
        System.out.println(max);
        sc.close();
    }
}