package com.company;

class LinkedList<E> {
    LinkedList next;
    E data;
}

class List<E> {
    private LinkedList head;
    private LinkedList tail;

    void addBack(E data) {
        LinkedList a = new LinkedList();
        a.data = data;
        if (tail == null) {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
    }

    void printList() {
        LinkedList t = head;
        while (t != null) {
            System.out.println(t.data + " ");
            t = t.next;
        }
    }
}
