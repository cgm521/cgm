package com.guangming.No_9;

import com.guangming.My8_31.Student;

import java.util.*;

/**
 * Created by cgm on 2017/9/5.
 * 集合
 */
public class MyLinkedList {
    public static void main(String[] args) {
        MyLinkedList();
    }

    public static void MyLinkedList() {
        LinkedList<String> linkedListA = new LinkedList();
        linkedListA.add("c");
        linkedListA.add("d");
        linkedListA.add("a");
        linkedListA.add("b");
        LinkedList<String> linkedListB = new LinkedList();
        linkedListB.add("e");
        linkedListB.add("s");
        linkedListB.add("a");
        linkedListB.add("m");
//        Iterator<String> iterator = linkedList.iterator();
//        Iterator<String> iterator2 = linkedList.iterator();
//        iterator.next();
//        iterator.remove();
//        iterator2.next();
//        System.out.println(linkedList);

        ListIterator<String> listIteratorA = linkedListA.listIterator();
        Iterator<String> iteratorB = linkedListB.iterator();
        while (iteratorB.hasNext()) {
            if (listIteratorA.hasNext()) System.out.println("A"+listIteratorA.next());
            String next = iteratorB.next();
            System.out.println(next);
            listIteratorA.add(next);
        }
        System.out.println(linkedListA);

        iteratorB = linkedListB.iterator();

        while (iteratorB.hasNext()) {
            iteratorB.next();
            if (iteratorB.hasNext()) {
                iteratorB.next();
                iteratorB.remove();
            }
        }
        System.out.println(linkedListB);

        linkedListA.addAll(linkedListB);
        System.out.println(linkedListA);

        Set<String> set = new HashSet<String>(linkedListA);
        System.out.println("set:"+set);
        TreeSet<String> treeSet = new TreeSet<String>(linkedListA);
        System.out.println("treeSet:"+treeSet);

        TreeSet<Student> studentTreeSet = new TreeSet<Student>(Comparator.comparing(Student::getBorth));

        System.out.println("------------");
        ListIterator<String> listIterator = linkedListA.listIterator();
        ListIterator<String> listIterator2 = linkedListA.listIterator();
        listIterator.next();
        listIterator.set("aa");
        listIterator2.next();
        listIterator2.set("aa2");
        listIterator.previous();
        listIterator.set("ee1");

        System.out.println(linkedListA.contains("ee1"));
        linkedListA.get(1);
        System.out.println(linkedListA);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.toString();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.toString();

        new Integer(12);
    }
}
