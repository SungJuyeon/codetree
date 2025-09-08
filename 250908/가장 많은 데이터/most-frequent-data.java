import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<>();
        int ans = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            hm.put(key, hm.getOrDefault(key, 0) + 1);
            ans = Math.max(ans, hm.getOrDefault(key,0));
        }

        System.out.println(ans);
    }
}