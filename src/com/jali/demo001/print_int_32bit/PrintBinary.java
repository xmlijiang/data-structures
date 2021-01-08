package com.jali.demo001.print_int_32bit;

import java.math.BigDecimal;

public class PrintBinary {

    /**
     * 打印num的32位的每个位是多少
     * @param num
     */
    public static void print(int num){
        for (int i = 31; i >= 0; i--) {
            /**
             * 32位:1011 0110 0000 0000 0000 0000 0000 0000
             *
             * & 符号：1&1=1，0&1=0
             * 第一次：1 左移31位，就到了第一位，1000 & 1011 第一位1000 非0，该位就是1
             * 第二次：1 左移30位，就到了第二位，0100 & 1011 第二位0000 为0，该位就是0
             *
             */
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    /**
     * 计算一个数的阶乘
     * 例如：5! = 1*2*3*4*5
     * @param num
     */
    private static void printFactorial(int num) throws Exception {
        if(num < 0){
            throw new Exception("负数无法计算阶乘");
        }
        if(num == 1){
            System.out.println(1);
            return;
        }
        BigDecimal total = new BigDecimal(2);
        for (int i = 3; i <= num; i++) {
            total = total.multiply(new BigDecimal(i));
        }
        System.out.println(total);
    }



    public static void main(String[] args) throws Exception {
         // int：32位 long：64位
//        int num = -1023;

//        print(num);
         //1111111111
         //1024 512 256 128 64 32 16 8 4 2 1

//        System.out.println(5);
//        System.out.println(~5+1);
//
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(~Integer.MIN_VALUE);
//        System.out.println(-Integer.MIN_VALUE);
//
//         System.out.println(~0);
//         System.out.println(~0+1);

         //int 中的负数可以是 取反+1 表达
//         System.out.println(~5+1); // -5

//         int num = 5000;
//         printFactorial(num);


    }
}
