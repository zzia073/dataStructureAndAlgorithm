package com.test.datastudy;

/**
 * @author ：fei
 * @date ：Created in 2019/9/10 0010 09:29
 */
public class AddOneToHandred {
    public static void main(String[] args) {
        int sum = 0;
        int end = 100;
        for (int i = 1; i <= end; i ++){
            sum += i;
        }

//        sum = (1 + end) * end / 2;

        System.out.println(sum);
    }
}
