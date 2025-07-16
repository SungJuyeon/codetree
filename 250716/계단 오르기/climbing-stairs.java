import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static long[] list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        list = new long[n+1];
        Arrays.fill(list, -1);

        System.out.print(step(n));
    }

    public static long step(int n) {
        if(n < 0) return 0;
        else if(n == 0) return 1;
        else if( n == 1 ) return 0;
        else if(n == 2 || n == 3) return 1;
        
        if(list[n] != -1) {
            return list[n];
        } 
        return list[n] = (step(n-2) + step(n-3)) % 10007;
        
    }
}