import java.util.*;

public class Main {
    public static int n = 0;
    public static int[][] segments;
    public static boolean[] checked = new boolean[1001];
    public static int cnt = 0;
    public static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        segments = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            segments[i][0] = sc.nextInt();
            segments[i][1] = sc.nextInt();
        }
        
        backtrack(0, 0);
        System.out.println(result);
    }

    public static void backtrack(int i, int cnt) {
        if(i == n) {
            result = Math.max(result, cnt);
            return;
        }
        
        backtrack(i+1, cnt); // 이 선분을 선택하지 않는 경우

        boolean canSelect = true;  //겹치지 않을 때 이 선분을 선택
        for(int c = segments[i][0]; c <= segments[i][1]; c++) { // i 번째 선분
            if(checked[c]) {
                canSelect = false;
                break;
            }
            
        }

        if(canSelect) {
            for(int c = segments[i][0]; c <= segments[i][1]; c++) {
                checked[c] = true;
            }
            backtrack(i+1, cnt+1);

            for(int c = segments[i][0]; c <= segments[i][1]; c++){
                checked[c] = false;
            }
        }
    }
}