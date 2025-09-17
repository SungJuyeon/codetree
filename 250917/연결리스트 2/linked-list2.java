import java.util.Scanner;
public class Main {
    public static class Node {
        int id;
        Node prev, next;
        public Node(int id) {
            this.prev = prev;
            this.next = next;
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        Node[] nodes = new Node[n+1];
        for(int i = 1; i <= n; i++) {
            nodes[i] = new Node(i);
        }

        while(q-->0) {
            int c = sc.nextInt();
            if(c==1) {
                // 1 i => pop
                int id = sc.nextInt();

                Node cur = nodes[id];
                if(cur.prev != null) cur.prev.next = cur.next;
                if(cur.next != null) cur.next.prev = cur.prev;

                cur.next = cur.prev = null;

            } else if(c==2) {
                // 2 i j => j번 노드를 i번 앞에 삽입
                int id1 = sc.nextInt();
                int id2 = sc.nextInt();

                // 2.prev.next = 1.next
                // 1.next.prev = 2.prev
                if(nodes[id2].prev != null) nodes[id2].prev.next = nodes[id2].next;
                if(nodes[id2].next != null) nodes[id2].next.prev = nodes[id2].prev;

                //2.prev = 1.prev
                //2.next = 1
                nodes[id2].prev = nodes[id1].prev;
                nodes[id2].next = nodes[id1];
                // 1.prev = 2
                if(nodes[id1].prev != null) nodes[id1].prev.next = nodes[id2];
                // 1.prev.next = 2
                nodes[id1].prev = nodes[id2];

            } else if(c==3) {
                // 3 i j => j번 노드를 i번 뒤에 삽입
                int id1 = sc.nextInt();
                int id2 = sc.nextInt();
                
                Node cur1 = nodes[id1];
                Node cur2 = nodes[id2];
                // 2.next.prev = 2.prev
                if(cur2.next != null) cur2.next.prev = cur2.prev;
                // 2.prev.next = 2.next
                if(cur2.prev != null) cur2.prev.next = cur2.next;
                // 2.prev = 1
                cur2.prev = cur1;
                // 2.next = 1.next
                cur2.next = cur1.next;
                // 1.next.prev = 2
                if(cur1.next != null) cur1.next.prev = cur2;
                // 1.next = 2
                cur1.next = cur2;
                
            } else {
                //i번 노드의 이전 노드, 다음 노드의 번호를 출력
                int id = sc.nextInt();
                int prevId = (nodes[id].prev != null) ? nodes[id].prev.id : 0;
                int nextId = (nodes[id].next != null) ? nodes[id].next.id : 0;
                System.out.println(prevId + " " +  nextId);
            }

        }
        //다음 노드 없으면 0 출력
        for(int i = 1; i <= n; i++){
            if(nodes[i].next == null) System.out.print("0 ");
            else System.out.print(nodes[i].next.id + " ");
        }
        System.out.println();

    }
}