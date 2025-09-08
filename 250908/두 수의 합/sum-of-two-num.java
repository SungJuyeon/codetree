import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<Integer, Integer> m= new HashMap<>();

        for (int i = 1; i <= n; i++) {
            m.put(i, sc.nextInt());
        }
        
        int ans = 0;
        for(int j = 1; j <= n; j++) {
            int find = k - j;
            if(m.containsKey(find)) ans++;
        }
        System.out.println(ans);
    }
}