import java.util.*;

public class Main {
    public static int n , m;
    public static List<Integer> list = new ArrayList<> ();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        combination(1);
    }
    public static void combination(int start) {
        if(list.size() == m) {
            for(int num: list) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for(int i = start; i <= n; i++) {
            list.add(i);
            combination(i+1);
            list.remove(list.size() - 1);
        }
    }
}
