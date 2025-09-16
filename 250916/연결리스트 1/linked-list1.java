import java.util.Scanner;
public class Main {
    static class Node {
        String data;
        Node prev, next;
        public Node(String data) {
            this.data=data;
            this.prev = this.next = null;
        }
    }

    static Node cur;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sInit = sc.nextLine();
        cur = new Node(sInit);
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i ++) {
            int c = sc.nextInt();
            if(c == 1) {
                String cmd = sc.next();
                Node nn = new Node(cmd);
                insertPrev(cur, nn);
            } else if(c == 2) {
                String cmd = sc.next();
                Node nn = new Node(cmd);
                insertNext(cur, nn);
            } else if(c == 3) {
                if(cur.prev != null) cur = cur.prev;
            } else {
                if(cur.next != null) cur = cur.next;
            }
            printNode();
        }
        sc.close();
    }

    public static void insertNext(Node u, Node singleton) {
        singleton.prev = u;
        singleton.next = u.next;

        if(u.next != null) {
            u.next.prev = singleton;
        }
        u.next = singleton;
    }

    public static void insertPrev(Node u, Node singleton) {
        singleton.prev = u.prev;
        singleton.next = u;

        if(u.prev != null) {
            u.prev.next = singleton;
        }
        u.prev = singleton;
    }

    public static void printNode() {
        String prev = (cur.prev != null) ? cur.prev.data : "(Null)";
        String curr = cur.data;
        String next = (cur.next != null) ? cur.next.data : "(Null)";
        System.out.println(prev + " " + curr + " " + next);
    }

}