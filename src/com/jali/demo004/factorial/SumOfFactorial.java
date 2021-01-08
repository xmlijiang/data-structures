package com.jali.demo004.factorial;

/**
 * 计算N的每个数相乘再相加的和
 * 比如：计算4
 * 1 + (1*2) + (1*2*3) + (1*2*3*4)
 * 1 + 2 + 6 + 24 + 120 + 720 + 5040 + 40320 + 362,880 + 362,8800
 * @author lijiang
 * @create 2021-01-08 10:35
 */
public class SumOfFactorial {

    /**
     * 方式一：
     * 两次循环
     * 第一次外循环，计算10就循环10次
     * 第二次循环，计算每个数和前面的数字相乘的结果
     *
     * 缺点：两次循环
     * @param n
     * @return
     */
    private static long f1(int n) {
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += factorial(i);
        }
        return ans;
    }

    private static long factorial(int n){
        long ans = 1;
        for (int j = 1; j <= n; j++) {
            ans *= j;
        }
        return ans;
    }

    /**
     * 方式二：一次循环
     * 把上次的结果直接乘以当前数字
     * @param n
     * @return
     */
    private static long f2(int n) {
        long ans = 0;
        long cur = 1;
        for (int i = 1; i <= n; i++) {
            cur *= i;
            ans += cur;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(f1(n));
        System.out.println(f2(n));
        System.out.println(Long.MAX_VALUE);
        int testTimes = 20;
        for (int i = 0; i < testTimes; i++) {
            System.out.println(f1(i));
            System.out.println(f2(i));
        }

    }
}
