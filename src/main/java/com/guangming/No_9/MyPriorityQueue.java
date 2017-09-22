package com.guangming.No_9;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * Created by cgm on 2017/9/8.
 */
public class MyPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<LocalDate> pq = new PriorityQueue<>();
        pq.add(LocalDate.of(1906, 12, 9));
        pq.add(LocalDate.of(1821, 12, 10));
        pq.add(LocalDate.of(1903, 12, 3));
        pq.add(LocalDate.of(1910, 6, 22));
        for (LocalDate date : pq) {
            System.out.println(date);
        }
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
