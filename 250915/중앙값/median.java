import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int m = sc.nextInt();
            PriorityQueue<Integer> left = new PriorityQueue<>();
            PriorityQueue<Integer> right = new PriorityQueue<>();
            for(int i = 1; i <= m; i++) {
                
                left.add(-sc.nextInt());
                
                //왼쪽 최대값이 오른쪽 최솟값보다 크면 교환
                if(!right.isEmpty() && -left.peek() > right.peek()) {
                    right.add(-left.poll());
                    left.add(-right.poll());
                }

                if(left.size() > right.size()+1) {
                    right.add(-left.poll());
                }

                //홀수번째 원소를 읽을 때
                if(i % 2 != 0) {
                    System.out.print(-left.peek()+ " ");
                }
            
            }
            System.out.println();
        }
    }
}