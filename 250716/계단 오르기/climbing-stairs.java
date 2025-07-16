import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int[] list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        list = new int[Math.max(n + 1, 4)];
        //Arrays.fill(list, -1);

        list[0] = 0;
        list[1] = 0;
        list[2] = 1;
        list[3] = 1;
        System.out.print(find(n));
    }

    // public static int step(int n) {
    //     if(n < 0) return 0;
    //     else if(n == 0) return 1;
    //     else if( n == 1 ) return 0;
    //     else if(n == 2 || n == 3) return 1;
        
    //     if(list[n] != -1) {
    //         return list[n];
    //     } 
    //     return list[n] = (step(n-2) + step(n-3)) % 10007;
        
    // }

    private static int find(int n) {
        for (int i = 4; i <= n; i++) {
            list[i] = (list[i - 2] + list[i - 3]) % 10007;
        }
        return list[n];
    }
}
