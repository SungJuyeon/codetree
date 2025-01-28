import java.util.Scanner;

public class Main {
    public static int offset = 100000;
    
    public static int n;
    public static int[] visited = new int[2 * offset + 1];
    public static int[] cntB = new int[2 * offset + 1];
    public static int[] cntW = new int[2 * offset + 1];
    public static int b, w, g;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int cur = offset;
        for(int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            if(c == 'L') {
                for(int p=x; p>0; p--){
                    visited[cur] = 1;
                    cntW[cur]++;
                    if(p > 1) cur--;
                }
            }
            else {
                for(int p=0; p<x; p++){
                    visited[cur] = 2;
                    cntB[cur]++;
                    if(p < x-1) cur++;
                }
            }
        }

        for(int i = 0; i <= 2 * offset; i++) {
            if(cntB[i] >= 2 && cntW[i] >= 2) g++;
            else if(visited[i] == 1) w++;
            else if(visited[i] == 2) b++;
        }

        System.out.print(w + " " + b + " " + g);
    }
}
