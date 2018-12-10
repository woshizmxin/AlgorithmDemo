package sort;

public class SingleNodeRevert {

    Node head;

    private class Node {
        private Object object;

        public Node(Object object) {
            this.object = object;
        }

        public Node next;
    }

    private void createNodes() {
        head = new Node(0);
        Node cur = head;
        for (int i = 1; i < 10; i++) {
            cur.next = new Node(i);
            cur = cur.next;
        }
    }

    private void printNodes() {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.object);
            cur = cur.next;
        }
    }

    private void revert() {
        if (head == null) {
            return;
        }
        Node cur = head;
        Node next = null;
        next = cur.next;
        Node tmp = null;
        while (next != null) {
            tmp = next.next;
            next.next = cur;
            cur = next;
            next = tmp;
        }
        head.next = null;
        head = cur;
    }

    public static void main(String[] args) {

        SingleNodeRevert nodeRevert = new SingleNodeRevert();
        nodeRevert.createNodes();
        nodeRevert.revert();
        nodeRevert.printNodes();
    }
}
