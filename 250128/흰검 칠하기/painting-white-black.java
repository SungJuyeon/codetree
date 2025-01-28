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
                for(int p=cur; p>cur-x; p--){
                    visited[p] = 1;
                    cntW[p]++;
                }
                cur = cur-x +1;
            }
            else {  //오른쪽 
                for(int p=cur; p<cur+x; p++){
                    visited[p] = 2;
                    cntB[p]++;
                }
                cur = cur+x - 1;
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
