import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        
        int maxK = 0, minK = Integer.MAX_VALUE, result = 0, maxT = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        
        for(int i=0; i< N; i++){
            int[] arr = new int[1000];
            maxK = 0; minK = 0; result = 0;
            for(int j=0; j<N; j++){
                if(i != j){
                    minK = Math.min(minK, A[i]);
                    maxK= Math.max(maxK, B[j]);
                    for(int k=A[j]; k < B[j]; k++){
                        arr[k]++;
                    }
                }
            }
            for(int l = minK; l < maxK; l++){
                if(arr[l] > 0) result++;
            }
            maxT = Math.max(maxT, result);
        }
        System.out.print(maxT);
        sc.close();
    }
}