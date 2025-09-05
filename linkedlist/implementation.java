public class implementation {
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
        int size=0;
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) { // empty list
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void inserAtIndex(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size()) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtHead(val);
            } else if (idx < 0) {
                System.out.println("Wrong Index");
                return;
            } else if (idx > size()) {
                System.out.println("Wrong Index");
                return;
            }
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        void display() {
            Node temp = head;
            if(idx<0 || idx>size()){
                System.out.println("wrong index");
                return -1;
            }
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        int size() {  //O(n)
            // Node temp = head;
            // int count = 0;
            // while (temp != null) {
            //     count++;
            //     temp = temp.next;
            // }
            // return count;
            return size;
        }
        int getAt(int idx){
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        // insert at end
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        // ll.display();
        System.out.println(ll.size());
        ll.insertAtEnd(12);
        // ll.display();
        // insert at head
        ll.insertAtHead(13);
        ll.inserAtIndex(2, 14);
        ll.display();
        //give index value
        System.out.println(ll.getAt(2));
    }
}
