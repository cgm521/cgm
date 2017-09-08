package com.guangming.No_9;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by cgm on 2017/9/5.
 * 集合
 */
public class MyAggregate {
    public static void main(String[] args) {
        MyLinkedList();
    }

    public static void MyLinkedList() {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        Iterator<String> iterator = linkedList.iterator();
        Iterator<String> iterator2 = linkedList.iterator();
        iterator.next();
        iterator.remove();
        iterator2.next();
        System.out.println(linkedList);
    }
}
