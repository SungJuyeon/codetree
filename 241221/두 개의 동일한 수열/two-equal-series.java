import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            b[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        Arrays.sort(b);

        boolean isSame = true;
        for(int i=0; i<N; i++){
            if(a[i] != b[i]) {
                isSame=false;
                break;
            }
        }
        System.out.println(isSame ? "Yes" : "No");
    }
}