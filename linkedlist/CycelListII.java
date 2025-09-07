// 142. Linked List CycleII -leetcoode-142
public class CycelListII {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node CyclicNodeII(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null) {
            if (slow == null)
                break;
            slow = slow.next;
            if (fast.next == null)
                break;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        Node temp = head;
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;

        }
        return slow;
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
        Node result = CyclicNodeII(head);
        System.out.println(result.data);

    }
}
