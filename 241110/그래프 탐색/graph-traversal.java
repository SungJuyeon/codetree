import java.io.*;
import java.util.*;

public class Main {
    public static int n, m;
    public static List<Integer>[] graph;
    public static boolean[] visited;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);
        graph = new ArrayList[n+1];
        for(int i=1; i <=n; i++){
            graph[i]= new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            String[] line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            graph[x].add(y);
            graph[y].add(x);
        }
        visited = new boolean[n+1];
        int num = DFS(1);

        bw.write(String.valueOf(num - 1));  // 1번 정점 제외
        bw.newLine();
        bw.flush();
        bw.close();
    }

    public static int DFS(int vertex){
        visited[vertex] = true;
        int count = 1;

        for(int i=0; i < graph[vertex].size(); i++){
            int currV = graph[vertex].get(i);
            if(!visited[currV]){
                count += DFS(currV);
            }
        }
        return count;
    }
}