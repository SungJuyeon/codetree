import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        heap_sort(arr, n);

        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void heap_sort(int[] arr, int n) {
        for(int i = n /2; i >= 1; i--) {
            heapify(arr, n, i);
        }

        for(int i = n; i > 1; i--) {
            swap(arr, 1, i);
            heapify(arr, i-1, 1);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int large = i;
        int l = i * 2;
        int r = i * 2 + 1;

        if (l <= n && arr[l] > arr[large]) large = l;
        if (r <= n && arr[r] > arr[large]) large = r;

        if(large != i) {
            swap(arr, i, large);
            heapify(arr, n, large);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}