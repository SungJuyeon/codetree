import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<Integer, Integer> m= new HashMap<>();
        long ans = 0;

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            if(m.containsKey(k-x)) {
                ans += m.get(k-x);
            }
            m.put(x, m.getOrDefault(x, 0) + 1);
        }
        System.out.println(ans);
    }
}