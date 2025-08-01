import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr.length-i-1; j++) {
        //         if(arr[j] > arr[j+1]){
        //             int tem = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = tem;
        //         }
        //     }
        // }
        // for (int i = 0; i < n; i++)
        //     System.out.print(arr[i] + " ");        

        boolean sorted = false;

        while(!sorted) {
            sorted = true;
            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i+1]){
                    int tem = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tem;
                    sorted= false;
                }
            }
        }

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}