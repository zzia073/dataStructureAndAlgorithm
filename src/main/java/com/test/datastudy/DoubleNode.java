package com.test.datastudy;

/**
 * @author ：fei
 * @date ：Created in 2019/9/11 0011 10:15
 * 双向链表
 */
public class DoubleNode<E> {
    E element;
    DoubleNode prev;
    DoubleNode next;
    public DoubleNode(E element){
        this.element = element;
        prev = this;
        next = this;
    }

    /**
     * =======================================
     *          ----->
     * current          next
     *          <-----
     * =======================================
     * =======================================
     *          ----->           ----->
     * current          element         next
     *          <-----           <-----
     * =======================================
     * @param element
     */
    public void after(DoubleNode element){
        DoubleNode next = this.next;
        this.next = element;
        element.prev = this;
        element.next = next;
        next.prev = element;
    }

    public static void main(String[] args) {
        DoubleNode<Integer> doubleNode = new DoubleNode<>(1);
        DoubleNode<Integer> doubleNode2 = new DoubleNode<>(2);
        DoubleNode<Integer> doubleNode3 = new DoubleNode<>(3);
        doubleNode.after(doubleNode2);
        doubleNode2.after(doubleNode3);
        System.out.println(doubleNode.element);
        System.out.println(doubleNode.next.element);
        System.out.println(doubleNode.prev.element);

    }
}
