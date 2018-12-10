package sort;

public class TwoLinkList {

    private Node first;
    private Node last;

    private class Node {
        Object object;

        Node(Object o) {
            this.object = o;
        }

        Node next;
        Node pre;
    }

    public void insertFirst(Object object) {
        Node node = new Node(object);
        if (first == null) {
            first = node;
            last = node;
        } else {
            node.next = first;
            first.pre = node;
            first = node;
        }
    }

    public void insertLast(Object object) {
        Node node = new Node(object);
        if (last == null) {
            first = node;
            last = node;
        } else {
            node.pre = last;
            last.next = node;
            last = node;
        }
    }

    public Object deleteFirst() throws Exception {
        if (first == null) {
            throw new NullPointerException("first is null");
        }
        Node tmp = first;
        first = first.next;
        first.pre = null;
        return tmp.object;
    }

    public Object deleteLast() throws Exception {
        if (last == null) {
            throw new NullPointerException("last is null");
        }
        Node tmp = last;
        last = last.pre;
        last.next = null;
        return tmp.object;
    }

    public void revert() throws Exception {
        last = first;
        Node pre = first;
        Node mid = pre.next;
        Node next = mid.next;
        pre.next = null;

        while (mid != null) {
            pre.pre = mid;
            mid.next = pre;
            pre = mid;
            mid = next;
            if (mid == null) {
                first = pre;
            } else {
                next = next.next;
            }
        }
    }


    public void revertA() throws Exception {

    }

    public void displayFirst() throws Exception {
        Node cur = first;
        while (cur != null) {
            System.out.println(cur.object);
            cur = cur.next;
            Thread.sleep(100);
        }
    }

    public void displayLast() throws Exception {
        Node cur = last;
        while (cur != null) {
            System.out.println(cur.object);
            cur = cur.pre;
            Thread.sleep(100);
        }
    }

    public void rmObject(Object object) {


    }

    public static void main(String[] args) throws Exception {
        TwoLinkList twoLinkList = new TwoLinkList();
        twoLinkList.insertFirst(6);
        twoLinkList.insertFirst(5);
        twoLinkList.insertFirst(4);
        twoLinkList.insertFirst(3);
        twoLinkList.insertFirst(2);
        twoLinkList.insertFirst(1);
        twoLinkList.displayFirst();
        System.out.println("#######################");
//        twoLinkList.insertLast("l2");
//        twoLinkList.insertLast("l1");
//        twoLinkList.deleteLast();
//        twoLinkList.displayLast();
        twoLinkList.revert();
//        twoLinkList.displayLast();
        twoLinkList.displayFirst();
//        twoLinkList.displayFirst();
    }
}
