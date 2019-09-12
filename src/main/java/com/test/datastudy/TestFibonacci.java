package com.test.datastudy;

/**
 * @author ：fei
 * @date ：Created in 2019/9/11 0011 11:18
 */
public class TestFibonacci {
    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
            System.out.print(i + ": ");
            System.out.println(fibonacci(i));
        }
    }
    public static int fibonacci(int n){
       if (n <= 2){
           return 1;
       }
       return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
