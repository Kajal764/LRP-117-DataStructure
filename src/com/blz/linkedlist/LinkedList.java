package com.blz.linkedlist;

public class LinkedList {

    Node head;
    Node tail;

    public Node push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node temp = this.head;  // 70
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            while (temp != null) {
                if (temp.next != null) {
                    System.out.print(temp.data + " -> ");
                } else {
                    System.out.print(temp.data);
                }
                temp = temp.next;
            }
        }
    }

    public Node append(int data) {
        Node newNode = new Node(data);
        if (head == null || tail == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            tail.next = newNode;
            this.tail = newNode;
        }
        return newNode;
    }

    public void insertInBetween(Node node, Node newNode) {
        Node temp = node.next;
        node.next = newNode;
        newNode.next = temp;
    }

    public void insertInMiddle(int data) {
        Node newNode = new Node(data);
        int length = size();
        int mid = length % 2 == 0 ? length / 2 : (length + 1) / 2;
        Node prevNode = head;
        Node nextNode = head;
        for (int i = 0; i < mid; i++) {
            prevNode = nextNode;  // 56
            nextNode = nextNode.next;  //70
        }
        prevNode.next = newNode;   // 56 -> 30
        newNode.next = nextNode;  // 30 - > 70
    }

    public int size() {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public Node pop() {
        Node tempNode = this.head;
        this.head = this.head.next;
        return tempNode;
    }

    public void popLast() {
        Node tempNode = head;
        while (!tempNode.next.equals(this.tail)) {
            tempNode = tempNode.next; // 30
        }
        this.tail = tempNode;
        tempNode.next = null;
    }

    public void search(int value) {
        Node tempNode = head;
        int count = 1;
        boolean flag = false;
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            while (tempNode != null) {
                if (tempNode.data == value) {
                    flag = true;
                    break;
                }
                count++;
                tempNode = tempNode.next;
            }
        }

        if (flag) {
            System.out.println("Element is present at " + count + " position");
        } else {
            System.out.println("Element not present in list");
        }
    }
}
