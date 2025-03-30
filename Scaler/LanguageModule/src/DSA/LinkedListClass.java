package DSA;

import Live2.Threading;

public class LinkedListClass {
    static class Node
    {
        int val;
        Node next;
        public Node(int x)
        {
            this.val = x;
            this.next = null;
        }
    }

    static Node reverse(Node head)
    {
        if(head == null || head.next == null) return head;
        Node prev = null;
        Node curr = head;

        while(curr != null)
        {
            Node currNext= curr.next;
            curr.next = prev;
            prev = curr;
            curr = currNext;
        }
        return prev;
    }
    static Node getMiddle(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next !=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    static void print(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp = head;
        for(int i: new int[]{2, 3, 4, 5, 6, 7})
        {
            temp.next = new Node(i);
            temp = temp.next;

        }
        print(head);

        Node mid = getMiddle(head);
        System.out.println(mid.val);



    }
}
