package com.test.datastudy;

import java.util.Arrays;

/**
 * @author ：fei
 * @date ：Created in 2019/9/10 0010 15:12
 * 队列 First In First Out 先进先出
 */
public class MyQueue {
    int[] elements;
    public MyQueue(){
        elements = new int[0];
    }

    public void add(int element) {
        int[] newArr = new int[elements.length + 1];
        newArr = Arrays.copyOf(elements, newArr.length);
        newArr[newArr.length - 1] = element;
        elements = newArr;
    }
    public int poll(){
        if (elements.length == 0) {
            throw new RuntimeException("empty queue");
        }
        int element = elements[0];
        elements = Arrays.copyOfRange(elements, 1, elements.length);
        return element;
    }
    public boolean empty(){
        return elements.length == 0;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add(1);
        myQueue.add(3);
        myQueue.add(6);
        myQueue.add(9);
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
    }
}
