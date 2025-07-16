import java.util.Scanner;
import java.util.List;

public class Main {
    public static int[] list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        list = new int[n+1];
        for(int i = 1; i <= n; i++)
            list[i] = -1;
        System.out.println(fibbo(n));
    }
    public static int fibbo(int n) {
//        if( n <= 0) return 0;
        if(list[n] != -1) {
            return list[n];
        }
        if ( n <= 2) {
            return list[n] = 1;
        }
        else {
            return list[n] = fibbo(n-1) + fibbo(n-2);
        }
    }
}