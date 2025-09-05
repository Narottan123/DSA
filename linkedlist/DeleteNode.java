// 237. Delete Node in a Linked List(leetcode).

public class DeleteNode {
    public static class Node {
        int data;
        Node next;

        // constructor call
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

        void deleteNode(Node node) {
            node.data = node.next.data;
            node.next = node.next.next;
        }

        // find Node value
        // here Node is return type because
        // its return Node reference;
        Node findNode(int val) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == val) {
                    return temp;
                }
                temp = temp.next;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(1);
        ll.insertAtEnd(9);
        // ll.display();
        Node deleteNode = ll.findNode(9);
        ll.deleteNode(deleteNode);
        ll.display();

    }
}
