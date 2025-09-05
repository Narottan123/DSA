public class Basic {

    // list node
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void displayRecursive(Node head) {
        if (head == null)
            return;
        System.out.println(head.data);
        displayRecursive(head.next);
    }

    public static void reverseLinkedList(Node head) {
        if (head == null)
            return;

        displayRecursive(head.next);
        System.out.println(head.data);
    }

    public static int lengthLinkedList(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        // output=> 1->2->3->4->5
        a.next = b; // 1->2
        // new b and a.next address will be same
        // System.out.println(a.next.data);
        b.next = c; // 1->2->3
        c.next = d; // 1->2->3->4
        d.next = e; // 1->2->3->4->5

        // Insersion is easy in linked list .for array we need to shift element for
        // middle insersion.
        // this is benifit of linkedList.

        // displaying linked list(if only head node given)
        // Node temp = a;
        // while(temp!=null){
        // System.out.println(temp.data);
        // temp=temp.next;
        // }

        // Now using function we will display linkedlist
        // display(a);

        // now Using Recursive function we will display linkedlist
        // displayRecursive(a);

        // reverse linked list
        // reverseLinkedList(a);

        // find length of linkedlist
        //System.out.println((lengthLinkedList(a)));

        

    }
}
