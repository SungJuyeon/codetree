import java.util.Scanner;
public class Main {
    public static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        step(n);
        System.out.print(ans);
    }

    public static void step(int n) {
        if(n == 2 || n == 3) {
            ans = 1;
            return;
        }
        if(n == 1) return;
        

        if(n == 0) {
            ans++;
        }
        
        if(n >= 2) {
            n -= 2;
            step(n);
        }
        if(n >= 3) {
            n -= 3;
            step(n);
        }

    }
}