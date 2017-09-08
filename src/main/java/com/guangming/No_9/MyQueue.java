package com.guangming.No_9;

/**
 * Created by cgm on 2017/9/6.
 */
public class MyQueue<E> {
    private int head;
    private int tail;
    private int size;
    private Object[] array;

    public MyQueue(int capacity) {
        this.array = new Object[capacity];
        this.size = capacity;
        this.head = 0;
        this.tail = -1;
    }

    public void add(int element) {
        if(this.tail > this.size) {
            throw new RuntimeException("数组长度已满");
        } else {
            this.array[++this.tail] = Integer.valueOf(element);
        }
    }

    public E remove() {
        if(this.tail < 0) {
            throw new RuntimeException("数组为空");
        } else {
            return (E)this.array[this.tail--];
        }
    }
}
