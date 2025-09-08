import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[k+1];
        HashMap<Integer, Integer> m = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            m.put(num, m.getOrDefault(num, 0) + 1);
        }

        List<Integer> nums = new ArrayList<>(m.keySet());
        nums.sort((a, b) -> {
            if(!m.get(a).equals(m.get(b))) {
                return m.get(b) - m.get(a);
            }
            else {
                return b-a;
            }
        });


        for(int i = 0; i < k; i++) {
            System.out.print(nums.get(i) + " ");
        }
    }
}