package LinkedListInOne;

import java.util.ArrayList;

public class LinkedListClass {

    //create linked list
    Node head;
    int length;
    public LinkedListClass()
    {
        head = null;
        length = 0;
    }

    public void addNodeAtStart(int data)
    {
        //create node 
        Node node = new Node(data);
        node.next = head;
        head = node;  
        length++;

    }

    public void addNodeAtEnd(int data)
    {
        //create node
        if(head == null)
        {
            Node node = new Node(data);
            head.next = node;
//            head = node;
            length++;
        }
        else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            Node node = new Node(data);
            ptr.next = node;
        }
    }
    //add at a pos
    public void addNodeAtPos(int val, int pos)
    {
        Node ptr = head;
        int cnt =0;
        while(cnt<pos-1)
        {
            ptr = ptr.next;
            cnt++;
        }
        Node newNode = new Node(val);
        Node temp = ptr.next;
        ptr.next = newNode;
        newNode.next = temp;

    }

    //add multiple nodes at start
    public void addNodeAtStart(int...data)
    {
        //create node
        for(Integer val: data)
        {
            Node node = new Node(val);
            node.next = head;
            head = node;
            length++;
        }
    }

    @Override
    public String toString() {
        String lists = "";
        Node ptr  = head;
        while(ptr != null){
            lists  = lists + ptr.data + " ";
            ptr = ptr.next;
        }
        return lists;
    }
}
