package com.test.datastudy;

/**
 * @author ：fei
 * @date ：Created in 2019/9/11 0011 14:12
 */
public class TestHanoi {
    public static void main(String[] args) {
        hanoi(3,"a","b","c");
    }

    /**
     *
     * @param n n个盘子
     * @param one 从第一个柱子
     * @param two 用第二个柱子
     * @param three 移动到第三个柱子
     * 可以看成1个盘子和n-1个盘子移动
     * 当盘子只有一个的时候从one --> three
     * 当盘子有n个的时候
     *              1.将 n-1 从 one --> two   hanoi(n - 1, one, three, two)
     *              2.将 n 从 one --> three   1个的情况 one --> three
     *              3.将 n-1 从 two --> three hanoi(n - 1, two, one, three)
     */
    public static void hanoi(int n,String one, String two, String three){
        if (n == 1){
            System.out.println(one + " --> " + three);
        }else {
            hanoi(n - 1, one, three, two);
            System.out.println(one + " --> " + three);
            hanoi(n - 1, two, one, three);
        }

    }
}
