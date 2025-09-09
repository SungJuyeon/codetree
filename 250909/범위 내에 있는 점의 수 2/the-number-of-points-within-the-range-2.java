import java.util.Scanner;
public class Main {
    public static final int MAXN = 1000000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] points = new int[MAXN+1];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            points[x] = 1;
        }

        for(int i = 1; i <= MAXN; i++) {
            points[i]+= points[i-1];
        }
        
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(points[b] - points[a-1]);
        }
    }
}