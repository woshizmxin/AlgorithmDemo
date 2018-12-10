package sort;

public class SingleLinkList {

    private Node first;

    private class Node {
        private Object object;

        public Node(Object object) {
            this.object = object;
        }

        private Node next = null;
    }

    public void insertFirst(Object object) {
        Node node = new Node(object);
        node.next = first;
        first = node;
    }

    public Object delFirst() throws Exception {
        if (first == null) {
            throw new Exception("empty exception");
        }
        Node temp = first;
        first = first.next;
        return temp.object;
    }

    public void revert() throws Exception {
        if (first == null) {
            throw new Exception("empty exception");
        }

        Node pre = first;
        Node mid = pre.next;
        Node next = mid.next;
        pre.next = null;

        while (mid != null) {
            mid.next = pre;
            pre = mid;
            mid = next;
            if (mid != null) {
                next = next.next;
            } else {
                first = pre;
            }
        }
    }

    public Object find(Object object) throws Exception {
        if (first == null) {
            throw new Exception("empty exception");
        }
        Node cur = first;
        while (cur != null) {
            if (cur.object.equals(object)) {
                return cur.object;
            }
            cur = cur.next;
        }
        return null;
    }

    public void display() throws Exception {
        if (first == null) {
            throw new Exception("empty exception");
        }
        Node cur = first;
        while (cur != null) {
            System.out.println(cur.object);
            Thread.sleep(100);
            cur = cur.next;
        }
    }


    public void removeObject(Object object) throws Exception {
        if (first == null) {
            throw new Exception("empty exception");
        }
        if (first.object.equals(object)) {
            first = first.next;
            return;
        }
        Node pre = first;
        Node cur = first.next;
        while (cur != null) {
            if (cur.object.equals(object)) {
                pre.next = cur.next;
            }
            pre = cur;
            cur = cur.next;
        }
    }

    public static void main(String[] args) throws Exception {
        SingleLinkList linkList = new SingleLinkList();
        linkList.insertFirst(6);
        linkList.insertFirst(5);
        linkList.insertFirst(4);
        linkList.insertFirst(3);
        linkList.insertFirst(2);
        linkList.insertFirst(1);
//        linkList.display();
//        linkList.delFirst();
//        linkList.display();
//        linkList.removeObject(4);
        linkList.display();
        System.out.println("*************");
        linkList.revert();
        linkList.display();
    }
}
