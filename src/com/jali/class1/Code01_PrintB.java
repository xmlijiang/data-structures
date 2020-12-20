package com.jali.class1;

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

     public static void main(String[] args) {
        // int：32位 long：64位
//        int num = -1023;

//        print(num);
        //1111111111
        //1024 512 256 128 64 32 16 8 4 2 1

        System.out.println(5);
        System.out.println(~5+1);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(~Integer.MIN_VALUE);
        System.out.println(-Integer.MIN_VALUE);

         System.out.println(~0);
         System.out.println(~0+1);

    }
}
