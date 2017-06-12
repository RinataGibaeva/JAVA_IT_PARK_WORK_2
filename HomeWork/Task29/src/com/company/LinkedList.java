package com.company;

class LinkedList<E> {
    LinkedList next;
    E data;
}

class List<E> {
    private LinkedList head;
    private LinkedList tail;

    void addFront(E data){
        LinkedList a = new LinkedList();
        a.data = data;

        if (head == null) {
            head = a;
            tail = a;
        } else {
            a.next = head;
            head = a;
        }
    }

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
            System.out.print(t.data + " ");
            t = t.next;
        }
    }

    void delEl(E data) {
        if (head == null)
            return;

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        LinkedList t = head;
        while (t.next != null) {
            if (t.next.data == data) {
                if (tail == t.next) {
                    tail = t;
                }
                t.next = t.next.next;
                return;
            }
            t = t.next;
        }
    }
}