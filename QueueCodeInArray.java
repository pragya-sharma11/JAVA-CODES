/*
 * Created by intellij IDEA
 *Author :Pragya Sharma
 * Date :21-July-2020
 * Time:8:30 pm
 * File Name: QueueCodeInArray */
package myWork;

import java.util.Scanner;

class QueueCodeInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestQueue ob = new TestQueue();
        int option;
        while (true) {
            System.out.println("1-push ,2-pop, 3-display ,4-exit");
            option = sc.nextInt();
            if (option == 1) {
                System.out.println("enter number to be feeded11");
                int number = sc.nextInt();
                ob.pushNumber(number);
            } else if (option == 2) {
                ob.popNumber();
            } else if (option == 3) {
                ob.display();
            } else if (option == 4) {
                System.out.println("Operation executed");
                break;
            } else {
                System.out.println("invalid input");
            }
        }


    }
}

class TestQueue {
    int[] numbersArray = new int[10];
    int rear = -1, front = -1, r = 0;

    void pushNumber(int number) {
        if (rear == 9) {
            System.out.println("Queue Overflow");
        } else if (rear == -1) {
            rear = 0;
            front += 1;
            numbersArray[rear] = number;
        } else {
            rear = rear + 1;
            numbersArray[rear] = number;
        }
    }

    void popNumber() {
        if (rear == -1) {

            System.out.println("Queue Overflow");
        } else if (rear == front) {
            r = numbersArray[rear];
            rear = front = -1;
            System.out.println(r);
        } else {
            r = numbersArray[front];
            front++;
            System.out.println(r);
        }
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.println(numbersArray[i]);
        }
    }
}
