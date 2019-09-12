package com.test.datastudy;

/**
 * @author ：fei
 * @date ：Created in 2019/9/11 0011 09:50
 */
public class LoopNode {
    private int data;
    private LoopNode next;
    private LoopNode(int data){
        this.data = data;
        this.next = this;
    }

    public int getData() {
        return data;
    }

    public LoopNode next(){
        return next;
    }
    //插入一个节点
    public void insert(LoopNode loopNode){
        LoopNode next = this.next;
        this.next = loopNode;
        loopNode.next = next;
    }
    //删除一个节点
    public void removeNext() {
        LoopNode next = this.next.next;
        this.next = next;
    }

    public static void main(String[] args) {
        LoopNode loopNode = new LoopNode(1);
        LoopNode loopNode2 = new LoopNode(2);
        LoopNode loopNode3 = new LoopNode(3);
        LoopNode loopNode4 = new LoopNode(4);
        loopNode.insert(loopNode2);
        loopNode.insert(loopNode3);
        loopNode.insert(loopNode4);
        System.out.println(loopNode.data);
        System.out.println(loopNode.next.data);
        System.out.println(loopNode.next.next.data);
        System.out.println(loopNode.next.next.next.data);

    }
}
