package LinkedListInOne;

public class NthNode {

    //Find nth Node in Linked List when Length is not known
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.getLength();
        ll.push(10);
        ll.push(11);
        ll.push(12);
        ll.push(13);
//        ll.getLength();
        ll.getNthNode(3);
    }



}

class LinkedList {
    Node head; // head of the list

    public int getLength()
    {
        Node ptr = head;
        int len = 0;
        while(ptr != null)
        {
            len++;
            ptr = ptr.next;
       }
        return len;
    }
    public void push(int d)
    {
        Node new_node = new Node(d);
        new_node.next = head;
        head = new_node;
    }
    public void getNthNode(int n) {
        int len = getLength();
        if (n > len) {
            return;

        }
        int ans = 0;
        Node temp = head;
        for (int i = 1; i < len - n + 1; i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder("");
        Node temp = head;
        while(temp != null)
        {
            ans.append(temp.data);
            ans.append(" ");
            temp = temp.next;

        }
        return ans.toString();
    }
}
