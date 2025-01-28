import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int offset = 10000; //offset
        int[] visited = new int[offset*2]; 
        int[] cntB = new int[offset*2];
        int[] cntW = new int[offset*2];
        int cur = offset;

        for(int i =0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            String pos = st.nextToken();

            if(pos.equals("L")){ //white
                for (int j = 0; j < x; j++) {
                    visited[cur] = 1;
                    cntW[cur]++;
                    if (j < x - 1) cur--;  // x가 1보다 클 때만 cur을 갱신
                }
            } else if(pos.equals("R")){ //black
                for (int j = 0; j < x; j++) {
                    visited[cur] = 2;
                    cntB[cur]++;
                    if (j < x - 1) cur++;  // x가 1보다 클 때만 cur을 갱신
                }
            }
        }
        int w =0, b=0, g=0;
        for (int i = 0; i < visited.length; i++) {
            if (cntB[i] >= 2 && cntW[i] >= 2) g++;
            else if (visited[i] == 1) w++;
            else if (visited[i] == 2) b++;
        }
        bw.write(w + " "+ b + " "+ g);
        bw.close();
    }
}