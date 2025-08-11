import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<> ();
        String str = sc.next();
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                s.push('(');
            } else {
                if(s.empty() == true) {
                    System.out.println("No");
                    return;
                }

                s.pop();
            }
        }
        if(s.empty() == false)
            System.out.println("No");
        else System.out.println("Yes");
    }
}