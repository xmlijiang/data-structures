package com.jali.class01;

import java.math.BigDecimal;

public class Code01_PrintB {

    /**
     * 打印num的32位的每个位是多少
     * @param num
     */
    public static void print(int num){
        for (int i = 31; i >= 0; i--) {
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
