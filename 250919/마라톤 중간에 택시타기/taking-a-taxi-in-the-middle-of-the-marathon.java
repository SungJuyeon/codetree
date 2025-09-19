import java.util.Scanner;
public class Main {
    public static class Pair{
        int x; int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n+1];
        int[] y = new int[n+1];
        for (int i = 1; i <= n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int[] L = new int[n+1];
        int[] R = new int[n+1];
        L[1] = 0;
        for(int i = 2; i <= n; i++) {
            L[i] = L[i-1] + Math.abs(distance(x[i-1], x[i], y[i-1], y[i]));
            //System.out.print("\nL : " + L[i]);
        }
        R[n] = 0;
        for(int i = n-1; i >= 1; i--) {
            R[i] = R[i+1] + Math.abs(distance(x[i+1], x[i], y[i+1], y[i]));
            //System.out.print("\nR : " + R[i]);
        }

        int minD = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            int dis = L[i-1] + R[i+1] + Math.abs(distance(x[i+1], x[i-1], y[i+1], y[i-1]));
            //System.out.print("\ndis : " + dis);
            minD = Math.min(minD, dis);
        }
        System.out.println(minD);

    }

    public static int distance(int x, int x2, int y, int y2) {
        return Math.abs(x-x2) + Math.abs(y-y2);
    }
}