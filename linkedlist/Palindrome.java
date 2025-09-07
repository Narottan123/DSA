
//Using Deep clone approache with extra space
public class Palindrome {
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
    public static boolean palindromeFunc(Node head){
        //step1:- deep clone the linked list
        Node cloneHead=null;
        Node cloneTail=null;
        Node temp=head;
        while(temp!=null){
            if(cloneHead==null){
                cloneHead=temp;
                cloneTail=temp;
            }
            else{
                cloneTail.next=temp;
                cloneTail=temp;
            }
            temp=temp.next;
        }

        //step 2:reverse the list using iterative approache
        Node revHead=reverse(cloneHead);

        //step 3 match deep clone list with original list
        Node t1=head;//original list head
        Node t2=revHead;//reverse list head
        while(t1!=null && t2!=null){
            if(t1.data!=t2.data){
                return false;
            }
        
            t1=t1.next;
            t2=t2.next;
        }
        return true;



    }

    public static Node reverse(Node cloneHead){
        //using three pointer
        Node prev=null;
        Node curr=cloneHead;
        Node after=null;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
    public static void main(String[] args){
          Node head=new Node(1);
          head.next=new Node(2);
          head.next.next=new Node(3);
          head.next.next.next=new Node(3);
          head.next.next.next.next=new Node(2);
          head.next.next.next.next.next=new Node(1);
          boolean r=palindromeFunc(head);
          System.out.println(r);
        //   display(r);
    }
}
