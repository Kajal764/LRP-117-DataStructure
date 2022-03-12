package com.blz.stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to push element in stack");
        Stack stack=new Stack();
        switch (sc.nextInt()){
            case 1 :
                stack.push();
        }
    }
}
