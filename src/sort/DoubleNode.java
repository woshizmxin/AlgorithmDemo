package sort;

public class DoubleNode {
    DoubleNode.Node head;
    Node end;

    private class Node {
        private Object object;

        public Node(Object object) {
            this.object = object;
        }

        public Node next;
        public Node pre;
    }

    private void createNodes() {
        head = new Node(0);
        Node next = new Node(1);
        Node cur = head;
        next.pre = cur;
        cur.next = next;

        for (int i = 1; i < 10; i++) {
            next = new Node(i);
            cur.next = next;
            next.pre = cur;
            cur = cur.next;
        }
        end = next;
    }

    private void printNodes() {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.object);
            cur = cur.pre;
        }
    }

    private void printEndNodes() {
        Node cur = end;
        while (cur != null) {
            System.out.println(cur.object);
            cur = cur.pre;
        }
    }


    private void rever() {
        Node pre= null;
        Node cur = head;
        while (cur!=null){
            Node tmp = cur.next;
            cur.next=pre;
            cur.pre=tmp;
            pre=cur;
            cur=tmp;
        }
    }

    public static void main(String[] args) {
        DoubleNode nodeRevert = new DoubleNode();
        nodeRevert.createNodes();
        nodeRevert.rever();
        nodeRevert.printNodes();
//        nodeRevert.printNodes(nodeRevert.reverseList(nodeRevert.head));
    }
}
