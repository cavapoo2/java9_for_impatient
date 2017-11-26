package com.andyr.impatient9.ch2;

public class C2E16 {
    public static void main(String[] args) {
        int[] data = {10,11,12,13,14,15,16,17,18,19,20};
        Queue q = new Queue();
        for(int i=0;i < data.length; i++) {
            q.enqueue(data[i]);
        }
        System.out.println("Length of queue is " + q.getLength());
        Queue.Node head = q.getHead();
        Queue.Node last = q.getLast();
        System.out.println("Head is " + q.getHead().data + ",last is " + q.getLast().data);
        q.dequeue();
        System.out.println("Head is " + q.getHead().data + ",last is " + q.getLast().data);
        Queue.Iterator it = q.getIterator();
        while(it.hasNext()) {
            System.out.printf("%d ",it.next().data);
        }
        Queue.Iterator an = q.getIterator();
        while(an.hasNext()) {
            System.out.printf("%d ",an.next().data);
        }
    }
}
class Queue {
    Node head, last;
    int length=0;
    void enqueue(int item) {
        if (head == null) {
            last = new Node(item);
            head = last;
        }
        else {
            last.next = new Node(item);
            last = last.next;
        }
        length++;
    }
    Node dequeue() {
        if(head != null ) {
            Node item = head;
            head = head.next;
            length--;
            return item;
        }
        return null;
    }
    Node getHead() { return head; }
    Node getLast() { return last;}
    Iterator getIterator() { return new Iterator();}
    int getLength(){ return length;}
    class Node {
        Node next = null;
        int data;
        public Node(int d) {
            data = d;
        }
        void appendToTail(int d) {
            Node end = new Node(d);
            Node n = this;
            while (n.next != null) {
                n = n.next;
            }
            n.next = end;
        }
    }
    class Iterator {
        Node curr = null;
        Iterator() {
            curr = head;
        }
        boolean hasNext() { return curr != null;}
        Node next() {
            Node v = curr;
            curr = curr.next;
            return v;
        }
    }
}

