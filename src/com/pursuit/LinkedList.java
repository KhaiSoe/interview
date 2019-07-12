package com.pursuit;

public class LinkedList {
    LinkedListNode head;
    private int size;

    public LinkedList(LinkedListNode head) {
        this.head = head;
        size = 1;
    }

    public int getSize() {
        return size;
    }


    public void append(String route) {
        LinkedListNode temp = new LinkedListNode(route);
        LinkedListNode current = head;
        if(head == null) {
            head = temp;
            size++;
            return;
        }

        while(current.next != null) {
            current = current.next;
        }
        current.next = temp;
        size++;
    }

    public void prepend(String route) {
        LinkedListNode temp = new LinkedListNode(route);
        temp.next = head;
        head = temp;
        size++;
    }

    public void print() {
        LinkedListNode current = head;
        while(current != null) {
            System.out.print(current.routeName + " --> ");
            current = current.next;
        }
        System.out.println(" NULL\n");
    }

}
