import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int result = 0;
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = i+1; j <n; j++){
                for(int k = j+1; k < n; k++){
                    int[] arr = new int[101];

                    for(int p = 0; p < n; p++){
                        if(p == i || p == j || p == k) continue;
                        for(int q = a[p]; q <= b[p]; q++){
                            arr[q]++;
                        }
                    }

                    boolean bool = false;
                    for(int p = 0;  p < 100; p++){
                        if(arr[p] > 1) bool = true;
                    }
                    if(bool == false) result++;
                }
            }
        }
        
        System.out.print(result);
        sc.close();
    }
}