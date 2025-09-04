import java.util.Scanner;
public class Main {
    public static int[] arr, nums;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        nums = new int[n];
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        init();

        for(int i = 1; i < n; i++) {
            arr[i] = Math.max(arr[i-1] + nums[i], nums[i]);
        }

        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, arr[i]);
        }
        System.out.println(ans);

    }

    public static void init() {
        for(int i = 0 ; i < n; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
        arr[0] = nums[0];
    }
}