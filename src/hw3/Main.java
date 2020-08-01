package hw3;

import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        reverseString();

        MyPriorityQueue myPriorityQueue = new MyPriorityQueue(Comparator.reverseOrder());
        myPriorityQueue.insert(5);
        myPriorityQueue.insert(1);
        myPriorityQueue.insert(7);
        myPriorityQueue.insert(4);
        myPriorityQueue.insert(2);
        System.out.println(myPriorityQueue);


        MyDequeue myDequeue = new MyDequeue();
        System.out.println(myDequeue.getBegin());
        System.out.println(myDequeue.getEnd());
        myDequeue.insertRight(1);
        System.out.println(myDequeue.getBegin());
        System.out.println(myDequeue.getEnd());
        myDequeue.insertRight(2);
        System.out.println(myDequeue.getBegin());
        System.out.println(myDequeue.getEnd());
        myDequeue.insertRight(3);
        System.out.println(myDequeue.getBegin());
        System.out.println(myDequeue.getEnd());
        myDequeue.insertLeft(4);
        System.out.println(myDequeue.getBegin());
        System.out.println(myDequeue.getEnd());

        System.out.println(myDequeue);
        while (!myDequeue.isEmpty()){
            myDequeue.removeLeft();
            System.out.println(myDequeue.getBegin());
            System.out.println(myDequeue.getEnd());

        }
        System.out.println(myDequeue);
    }

    public static void reverseString() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(scanner.nextLine()).reverse());
    }
}
