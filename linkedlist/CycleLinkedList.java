// 141. Linked List Cycle -leetcoode-141
public class CycleLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean CyclicNode(Node head) {
        Node slow = head;
        Node fast = head;
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return false;
        }
        while (fast != null) {
            if (slow == null)
                return false;
            slow = slow.next;
            if (fast.next == null)
                return false;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);
        // cycle linkedList
        head.next.next.next.next = head.next;
        // display(head);
        boolean result = CyclicNode(head);
        System.out.println(result);

    }
}
