package com.blz.linkedlist;

public class Operations {

    public LinkedList addElementInStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
        return linkedList;
    }

    public void addElementAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }

    public void insertNodeInBetween() {
        LinkedList linkedList = new LinkedList();
        Node first = linkedList.append(56);
        Node second = linkedList.append(70);
        Node newNode = new Node(30);
        System.out.println("Before");
        linkedList.print();
        System.out.println();
        linkedList.insertInBetween(first, newNode);
        System.out.println("After");
        linkedList.print();
        // 30
    }

    public void insertInMiddle() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(70);
        System.out.println("Before");
        linkedList.print();
        linkedList.insertInMiddle(30);
        System.out.println("After");
        linkedList.print();
    }

    public void deleteNodeFromStart() {
        LinkedList linkedList = addElementInStart();
        System.out.println();
        linkedList.pop();
        linkedList.print();

    }

    public void deleteNodeFromEnd() {
        LinkedList linkedList = addElementInStart();
        System.out.println();
        linkedList.popLast();
        linkedList.print();
    }

    public void searchNode() {
        LinkedList linkedList = addElementInStart();
        System.out.println();
        linkedList.search(79);
    }
}
