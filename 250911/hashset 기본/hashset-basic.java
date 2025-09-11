import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            int x = sc.nextInt();
            
            if(command.equals("find")) {
                if(!hs.contains(x)) {System.out.println("false");}
                else {System.out.println("true");}
            } else if(command.equals("add")) {
                hs.add(x);
            } else if(command.equals("remove")) {
                hs.remove(x);
            }
        }
    }
}