public class IntersectionOfTwoList {
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

    public static Node intersectList(Node headA, Node headB) {
        Node tempA = headA;
        Node tempB = headB;
        int sizeA = 0;
        int sizeB = 0;
        // find the length of each linked list
        while (tempA != null) {
            sizeA++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            sizeB++;
            tempB = tempB.next;
        }
        // right now tempA and tempB null soo again initialize
        tempA = headA;
        tempB = headB;
        // step 2 is which size big step forward that size;
        if (sizeA > sizeB) {
            for (int i = 0; i < sizeA - sizeB; i++) {
                tempA = tempA.next;
            }
        } else {
            for (int i = 0; i < sizeB - sizeA; i++) {
                tempB = tempB.next;
            }

        }
        while (tempA != null && tempB != null) {
            if (tempA == tempB) {
                return tempA;
            }
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return null;

    }

    public static void main(String[] args) {
        // Create first linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node headA = new Node(1);
        headA.next = new Node(2);
        Node intersect = new Node(3);
        headA.next.next = intersect;
        intersect.next = new Node(4);
        intersect.next.next = new Node(5);

        // Create second linked list: 9 -> 3 -> 4 -> 5 (intersects at 3)
        Node headB = new Node(9);
        headB.next = intersect;
        System.out.println("list A");
        display(headA);
        System.out.println("list B");
        display(headB);
        System.out.println("intersect point");
        Node point = intersectList(headA, headB);
        System.out.println(point.data);

    }
}