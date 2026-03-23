import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Jewel[] arr = new Jewel[n];
        for (int i = 0; i < n; i++) {
            int w = sc.nextInt();
            int v = sc.nextInt();
            arr[i] = new Jewel(w,v);
        }
        Arrays.sort(arr, (a, b) -> Double.compare(b.ratio , a.ratio));

        double answer = 0;

        for(int i = 0; i < n; i++) {
            if(m >= arr[i].w) {
                answer += arr[i].v;
                m -= arr[i].w;
            } else {
                answer += arr[i].ratio * m;
                break;
            }
        }
        System.out.printf("%.3f", answer);
    }
}

class Jewel {
    int w, v;
    double ratio;

    public Jewel(int w, int v){
        this.w = w;
        this.v = v;
        this.ratio = (double) v / w;
    }
}