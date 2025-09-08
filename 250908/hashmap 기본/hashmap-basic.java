import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < n; i++){
            String cmd = sc.next();
            switch(cmd) {
                case "add":
                    hm.put(sc.nextInt(), sc.nextInt());
                    break;
                case "find":
                    int findKey = sc.nextInt();
                    if(hm.containsKey(findKey)) {
                        System.out.println(hm.get(findKey));
                    }else {
                        System.out.println("None");
                    }
                    break;
                case "remove":
                    hm.remove(sc.nextInt());
            }
        }
    }
}