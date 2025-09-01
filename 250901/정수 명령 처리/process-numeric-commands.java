import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < n; i++) {
            String cmd = sc.next();

            if(cmd.equals("push")) {
                int x = sc.nextInt();
                s.push(x);
            }
            else if(cmd.equals("pop")) {
                System.out.println(s.pop());
            }
            else if(cmd.equals("size")) {
                System.out.println(s.size());
            }
            else if(cmd.equals("empty")) {
                if(s.isEmpty()) {
                    System.out.println(1);
                } else System.out.println(0);
            }
            else {
                System.out.println(s.peek());
            }
        }
    }
}