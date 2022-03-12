package com.blz.stack;

import com.blz.linkedlist.LinkedList;
import com.blz.linkedlist.Node;

public class Stack {

    public Node top;
    public LinkedList linkedList;

    public Stack() {
        linkedList = new LinkedList();
    }

    public void push() {
        linkedList.push(70);
        linkedList.push(30);
        this.top = linkedList.push(56);
        System.out.println(this.top);
        linkedList.print();
    }
}
