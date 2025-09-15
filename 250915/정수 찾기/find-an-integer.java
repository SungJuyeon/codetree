import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> A = new HashSet<>(n);
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }
        int m = sc.nextInt();
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            B[i] = (sc.nextInt());
        }
        
        for(int i = 0; i < B.length; i++){
            if (A.contains(B[i])) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

    }
}