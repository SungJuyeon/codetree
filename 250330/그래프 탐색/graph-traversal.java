import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int MAX_INT = 1000;
    public static ArrayList<Integer>[] graph = new ArrayList[MAX_INT
    +1];
    public static boolean[] visited = new boolean[MAX_INT+1];
    public static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1; i <= n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<m; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            graph[v1].add(v2);
            graph[v2].add(v1);
        }

        visited[1] = true;
        DFS(1);
        
        System.out.println(cnt);
    }

    public static void DFS(int num){
        for(int i = 0; i < graph[num].size(); i++){
            int curV = graph[num].get(i);
            if(!visited[curV]) {
                visited[curV] = true;
                cnt++;
                DFS(curV);
            }
        }
    }
}