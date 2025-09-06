public class DeleteMiddle {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node DeleteMiddleNodeFunc(Node head) {
        Node slow = head;
        Node fast = head;
        // odd number->fast.next.next.next==null
        // while (fast.next.next.next != null) {
        // slow = slow.next;
        // fast = fast.next.next;
        // }
        // even number-right middle node delete
        // while (fast.next.next != null) {
        // slow = slow.next;
        // fast = fast.next.next;
        // }
        // even number-left middle node delete
        while (fast.next.next.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;

        return head;

    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        Node a = DeleteMiddleNodeFunc(head);
        display(a);

    }
}
