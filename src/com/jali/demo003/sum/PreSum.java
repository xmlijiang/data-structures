package com.jali.demo003.sum;

/**
 * g取数
 * 一个数组或者集合[3,4,2,1,6,7,8]
 * 计算x-y范围内的数字相加等于多少
 * 比如1-3范围，4-6范围
 */
public class PreSum {

    public static void main(String[] args) {
        int[] arr = {3,4,2,1,6,7,8};
        sumArr(arr,1,3);// 9
        sumArr(arr,3,3);// 2
        sumArr(arr,1,7);// 31
    }

    /**
     * 方式1：使用二维数组
     * @param arr 数组
     * @param startIndex 起始范围，从1开始
     * @param endIndex 结束范围
     */
    private static void sumArr(int[] arr, int startIndex, int endIndex) {
        if(arr==null){
            System.out.println("arr is null");
        }
        if(startIndex>endIndex){
            System.out.println("index is error");
        }
        if(endIndex > arr.length){
            System.out.println("endIndex is larger than arr's size");
        }
        if(startIndex<1){
            System.out.println("startIndex must larger than zero");
        }
        // 第一步：把数组转换成二维数组
        int[][] data = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(i==j){
                    data[i][j] = arr[j];
                }else{
                    data[i][j] = data[i][j-1] + arr[j];
                }
            }
        }

        // 第二步：查询二维数组中的数据
        System.out.println("第"+startIndex+"~"+endIndex+"的数据和是：" + data[startIndex-1][endIndex-1]);
    }


}
