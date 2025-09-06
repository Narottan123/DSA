public class nthNodeFromEnd {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        Node nthNodeFromEnd(Node head, int idx) {
            int size = 0;
            Node temp = head;
            while (temp != null) {
                size++;
                temp = temp.next;
            }
            int a = size - idx;

            // a node from end;
            temp = head;
            for (int i = 0; i < a; i++) {
                temp = temp.next;
            }
            System.out.println(temp.data);
            return temp;
        }

        Node nthNodeFromEndOptimization(Node head, int idx) {
            Node slow = head;
            Node fast = head;
            for (int i = 1; i <= idx; i++) {
                fast = fast.next;
            }
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(100);
        ll.insertAtEnd(13);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(12);
        ll.insertAtEnd(10);
        // ll.display();

        // ll.nthNodeFromEnd(ll.head, 3);
        Node result = ll.nthNodeFromEndOptimization(ll.head, 3);
        System.out.println(result.data);
        // ll.display();

    }
}
