import java.util.Scanner;
public class Main {

    public static class Node{
        int data;
        Node prev, next;
        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n+1];
        for(int i = 1; i <= n; i++) {
            nodes[i] = new Node(i);
            connect(nodes[i-1], nodes[i]);
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            swapList(nodes[a], nodes[b], nodes[c], nodes[d]);
        }

        Node cur = nodes[1];    //값이 1인 노드 객체 위치
        while(cur.prev != null) {
            cur = cur.prev;
        }
        while(cur != null) {
            System.out.print(cur.data+ " ");
            cur = cur.next;
        }
    }

    public static void swapList(Node a, Node b, Node c, Node d) {
        Node aPrev = c.prev;
        Node bNext = d.next;
        Node cPrev = a.prev;
        Node dNext = b.next;

        if(b.next==c) {
            aPrev = d;
            dNext = a;
        }
        if(d.next == a){
            bNext = c;
            cPrev = b;
        }

        if(aPrev != null) aPrev.next = a;
        a.prev = aPrev;

        if(bNext != null) bNext.prev = b;
        b.next = bNext;

        if(cPrev != null) cPrev.next = c;
        c.prev = cPrev;

        if(dNext != null) dNext.prev = d;
        d.next = dNext;
    }

    public staticvoid connect(Node preN, Node n) {
        if(preN != null) preN.next = n;
        if(n != null) n.prev = preN;
    }
}