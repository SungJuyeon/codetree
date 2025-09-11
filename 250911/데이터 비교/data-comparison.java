import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> arr1 = new HashSet<>(n+1);
        for (int i = 0; i < n; i++) {
            arr1.add(sc.nextInt());
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        
        int[] exist = new int[m+1];

        for(int i = 0; i < m; i++) {
            if(arr1.contains(arr2[i])) {
                exist[i] = 1;
            }
        }

        for(int i = 0; i < m; i++) {
            System.out.print(exist[i] + " ");
        }
    }
}