package com.test.datastudy;

/**
 * @author ：fei
 * @date ：Created in 2019/9/10 0010 15:30
 */
public class MySingleLink {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.add(node2).add(node3).add(node4).add(node5);
        System.out.println(node1);
        System.out.println(node1.size());
        System.out.println(node1.get(2));
    }
}
class Node{
    Object element;
    Node next;
    public Node(Object element){
        this.element = element;
    }
    public Node add(Node element){
        Node addNode = this;
        while (addNode.next != null){
            addNode = addNode.next;
        }
        addNode.next = element;
        return this;
    }
    public void delete(int index){

    }
    public void insert(Node element, int index) {

    }
    public void removeNext(){
        if (this != null && next != null){
            Node newNext = this.next.next;
            this.next = newNext;
        }
    }
    public void after(Node node){
        Node next = this.next;
        this.next = node;
        node.next = next;
    }
    public Node next(){
        return next;
    }
    public Node get(int index){
        if (index < 0 || index >= this.size()){
            throw new RuntimeException("index" + index + " is out of bounds");
        }
        int i = 0;
        Node currentNode = this;
        while (currentNode != null){
            if (index == i++){
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }
    public int size(){
        int size = 0;
        Node currentNode = this;
        while (currentNode != null){
            size ++;
            currentNode = currentNode.next;
        }
        return size;
    }
    public boolean isLast(){
        return next == null;
    }

    @Override
    public String toString() {
        int i = 0;
        String str = "";
        Node currentNode = this;
        do {
            str = str.concat(this.getClass().getSimpleName().concat("["+ i ++ +"] = ")
                    .concat(currentNode.element.toString()));
            currentNode = currentNode.next;
            if (currentNode != null) {
                str = str.concat(System.lineSeparator());
            }
        } while (currentNode != null);
        return str;
    }

}
