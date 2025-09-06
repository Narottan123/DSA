public class MiddleNode {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node MiddleNodeFunc(Node head) {
        Node slow = head;
        Node fast = head;
        //if even number and want left middle node
        while (fast != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //if even number and want right middle noode
        // while (fast != null) {
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }

        //if odd number and want  middle noode
        // while (fast != null && fast.next != null) {
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        return slow;
        
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        Node a=MiddleNodeFunc(head);
        display(a);

    }
}
