import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<String, Integer> si = new HashMap<>();
        HashMap<Integer, String> is = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String src = sc.next();
            si.put(src, i);
            is.put(i, src);
        }

        for (int j = 1; j <= m; j++) {
            String find = sc.next();
            try {
                int f = Integer.parseInt(find);
                System.out.println(is.get(f));
            } catch(NumberFormatException e) {
                System.out.println(si.get(find));
            }

        }
        

    }
}