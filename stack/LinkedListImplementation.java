public class LinkedListImplementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Stack {
        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.print("Stack is empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;
        }

        int peek() {
            if (head == null) {
                System.out.print("Stack is empty");
            }
            return head.data;
        }

        void displayRec(Node h){
            if(h==null){
                return;
            }
            displayRec(h.next);
            System.out.print(h.data+ "  ");
        }

        void display() {
            displayRec(head);
            System.out.println();
        }

        void displayRev() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            if (size == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(6);
        st.display();// 4 5 6
        st.pop();

    }
}
