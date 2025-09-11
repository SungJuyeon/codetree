import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        HashSet<Integer> h = new HashSet<>(n+1);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if(!h.contains(arr[i])) h.add(arr[i]);
        }
        System.out.println(h.size());
    }
}