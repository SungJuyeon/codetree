import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] line = new int[200];  //-100~100    offset=100

        for(int i=0; i<n; i++){
            int x1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;

            for(int j = x1; j < x2; j++){
                line[j]++;
            }
        }
        int max = Arrays.stream(line).max().getAsInt();
        System.out.print(max);
    }
}