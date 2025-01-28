import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int offset = 100000;
        int cur = offset;
        int[] visited = new int[offset*2 + 1];

        for(int i =0; i<n; i++){
            int x = sc.nextInt();
            char c = sc.next().charAt(0);

            if(c=='L'){
                for(int p=cur; p > cur-x; p--){
                    visited[p] = 1;  //흰색
                }
                cur = cur-x+1;

            }
            else{
                for(int p = cur; p < cur+x; p++){
                    visited[p] = 2;  //검은색
                }
                cur = cur +x-1;
            }
        }
        
        int b=0, w=0;
        for(int i=0; i<visited.length; i++){
            if(visited[i] == 1) w++;
            else if(visited[i] == 2) b++;
        }
        System.out.println(w + " " + b);
        sc.close();
    }
}