public class ReverseList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node reverse(Node head){
        if(head.next==null) return head;
        //1.recursive call after head
        Node newHead=reverse(head.next);
        //2.interchange connection between head and head.next.next beccause currently head.next.next nothing point
        head.next.next=head;
        //3.current head that will tails points null
        head.next=null;
        return newHead; 
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // display(a);
        
        Node r=reverse(a);
        display(r);
    }
}
