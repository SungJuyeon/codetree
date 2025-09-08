import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < m; i++) {
            int find = sc.nextInt();
            int ans = hm.getOrDefault(find, 0);
            System.out.print(ans + " ");
        }

    }
}