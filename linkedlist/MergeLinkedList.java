public class MergeLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node headA, Node headB) {
        Node tempA = headA;
        Node tempB = headB;
        System.out.println("first linked list");
        while (tempA != null) {
            System.out.println(tempA.data);
            tempA = tempA.next;
        }
        System.out.println("second linked list");
        while (tempB != null) {
            System.out.println(tempB.data);
            tempB = tempB.next;
        }

    }

    // public static Node MargeList(Node headA, Node headB) {
    // Node tempA = headA;
    // Node tempB = headB;

    // Node head = new Node(100);
    // Node temp = head;
    // while (tempA != null && tempB != null) {
    // if (tempA.data < tempB.data) {
    // Node a = new Node(tempA.data);
    // temp.next = a;
    // tempA = tempA.next;
    // } else {
    // Node a = new Node(tempB.data);
    // temp.next = a;
    // tempB = tempB.next;
    // }
    // temp = temp.next;
    // }
    // if (tempA == null) {
    // temp.next = tempB;
    // } else {
    // temp.next = tempA;
    // }
    // return head.next;
    // }
    
    //by moving temp we can do that without extra space
    public static Node MargeListWithoutSpace(Node headA,Node headB){
        Node temp1=headA;
        Node temp2=headB;
        Node head=new Node(-1);
        Node temp=head;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                temp.next=temp1;
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        if(temp1==null){
            temp.next=temp2;
        }
        else{
            temp.next=temp1;
        }
        return head.next;
    }

    public static void main(String[] args) {
        // first linkedlist
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(4);

        // second linked list
        Node headB = new Node(1);
        headB.next = new Node(3);
        headB.next.next = new Node(4);
        // display(headA, headB);
        // Node result = MargeList(headA, headB);
         Node result = MargeListWithoutSpace(headA, headB);
        //show marge list
        while(result!=null){
            System.out.println(result.data);
            result=result.next;
        }
    }

}
