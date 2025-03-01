import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int minA = Integer.MAX_VALUE;

        for(int j=0; j<N; j++){
            int maxX = 0, minX  = 40000, maxY = 0, minY = 40000;
            for(int i = 0; i < N; i++){
                if(i != j){
                    maxX = Math.max(maxX, x[i]);
                    minX = Math.min(minX, x[i]);
                    maxY = Math.max(maxY, y[i]);
                    minY = Math.min(minY, y[i]);
                }
            }
            minA = Math.min(minA, (maxX-minX) * (maxY-minY));
        }
        System.out.print(minA);
        sc.close();
    }
}