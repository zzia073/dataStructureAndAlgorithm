package com.test.datastudy;


/**
 * @author ：fei
 * @date ：Created in 2019/9/10 0010 11:11
 * 栈 Last In First Out 后进先出
 * 1．进栈（PUSH）算法
 * ①若TOP≥n时，则给出溢出信息，作出错处理（进栈前首先检查栈是否已满，满则溢出；不满则作②）；
 * ②置TOP=TOP+1（栈指针加1，指向进栈地址）；
 * ③S(TOP)=X，结束（X为新进栈的元素）；
 * 2．退栈（POP）算法
 * ①若TOP≤0，则给出下溢信息，作出错处理(退栈前先检查是否已为空栈， 空则下溢；不空则作②)；
 * ②X=S(TOP)，（退栈后的元素赋给X）：
 * ③TOP=TOP-1，结束（栈指针减1，指向栈顶）。
 */
public class MyStack {
    int[] elements;
    public MyStack(){
        elements = new int[0];
    }
    public void push(int element){
        int[] newArr = new int[elements.length + 1];
        copy(elements, newArr);
        newArr[newArr.length - 1] = element;
        elements = newArr;
    }

    public int pop() {
        if (elements.length == 0){
            throw new RuntimeException("empty stack");
        }
        int lastElement = elements[elements.length - 1];
        int[] newArr = new int[elements.length - 1];
        copy(elements, newArr);
        elements = newArr;
        return lastElement;
    }
    public int peek(){
        if (elements.length == 0){
            throw new RuntimeException("empty stack");
        }
        return elements[elements.length - 1];
    }
    public boolean isEmpty(){
        return elements.length == 0;
    }
    private void copy(int[] oldArr, int[] newArr){
        for (int i = 0; i < Integer.min(oldArr.length, newArr.length); i++) {
            newArr[i] = oldArr[i];
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(3);
        myStack.push(4);
        myStack.push(2);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
