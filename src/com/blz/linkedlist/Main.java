package com.blz.linkedlist;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Operations operations=new Operations();

        System.out.println("Enter 1 to add data from start");
        System.out.println("Enter 2 to add data from end");
        System.out.println("Enter 3 to add element in middle");
        System.out.println("Enter 4 to delete element from start");
        System.out.println("Enter 5 to delete element from last");
        System.out.println("Enter 6 to search data");
        switch (sc.nextInt()) {
            case 1:
                operations.addElementInStart();
                break;
            case 2:
                operations.addElementAtEnd();
                break;
            case 3:
                operations.insertInMiddle();
                break;
            case 4:
                operations.deleteNodeFromStart();
                break;
            case 5:
                operations.deleteNodeFromEnd();
                break;
            case 6:
                operations.searchNode();
                break;
            default:

        }


//        Node first = new Node(56);
//        Node second = new Node(30);
//        Node third = new Node(70);
//        first.next = second;
//        second.next = third;
//        Node head = first;
//        Node temp = head;
//        while (temp != null) {
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
    }
}
