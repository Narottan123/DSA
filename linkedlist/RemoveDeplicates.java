public class RemoveDeplicates {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
          Node temp=head;
          while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
          }
    }
    public static Node RemoveDuplicateFunc(Node head){
        Node temp=head;
        while(temp!=null && temp.next!=null){
            //if match value is replace next next value
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;

            }
            //if not match points to next value
            else{
                temp=temp.next;
            }
        }
        return head;
    }
    public static void main(String[] args){
          Node head=new Node(1);
          head.next=new Node(1);
          head.next.next=new Node(2);
          head.next.next.next=new Node(4);
          head.next.next.next.next=new Node(4);
          //display(head);
          Node result=RemoveDuplicateFunc(head);
          while(result!=null){
            System.out.println(result.data);
            result=result.next;
          }

    }
}
