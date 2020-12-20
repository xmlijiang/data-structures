package com.jali.class1;

public class Code02_SelectionSort {

    private static void printArray(int[] arr) {
        if(arr == null){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 选择排序
     * 遍历第一遍数组，找出最小值
     * 遍历第二遍，找出第二小的值
     * 遍历第N遍，找出最后的值
     *
     * 数组长度为 N
     * 0~N-1 找出最小值放在0的位置上
     * 1~N-1 找出最小值放在1的位置上
     * 2~N-1 找出最小值放在2的位置上
     *
     * @param arr
     */
    private static void selectionSort(int[] arr) {
        if(arr == null || arr.length < 2){
           return;
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < n; j++) {
                minValueIndex = arr[minValueIndex] > arr[j] ? j : minValueIndex;
            }
            swap(arr,i,minValueIndex);
        }
    }

    /**
     * 冒泡排序
     * 0 ~ N-1 找出最大的，放在N-1的位置
     * 0 ~ N-2 找出最大的，放在N-2的位置
     * 0 ~ N-3 找出最大的，放在N-3的位置
     * 0 ~ end 找出最大的，放在end的位置上
     * end = length -1 ~ 1
     * @param arr
     */
    private static void bubbleSort(int[] arr) {
        if(arr == null || arr.length < 2){
            return;
        }
        int n = arr.length;
        for (int end = n; end > 0; end--) {
            for (int i = 0; i < end-1; i++) {
                if(arr[i] > arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }

    /**
     * 插入排序
     * 0 ~ 1范围上有序
     * 0 ~ 2范围上有序
     * 0 ~ 3范围上有序
     * 0 ~ n-1范围上有序
     * n向n-1比较，n大就不用，n小继续和n-2比较，直到n是大的
     *
     * newNumIndex 当前下标
     * 跳出while循环的条件
     * 如果当前值的左边没有数了，或者，当前值的左边没有大于当前值
     *
     * @param arr
     */
    private static void insertSort(int[] arr) {
        if(arr == null || arr.length < 2){
            return;
        }
        int n = arr.length;
        for (int end = 1; end < n; end++) {
            int newNumIndex = end;
            while(newNumIndex-1 >= 0 && arr[newNumIndex-1] > arr[newNumIndex]){
                swap(arr,newNumIndex-1,newNumIndex);
                newNumIndex--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,6,12,8,6,2,1,6,5,1};
        printArray(arr);
//        selectionSort(arr);
//        bubbleSort(arr);
        insertSort(arr);
        printArray(arr);
    }



}
