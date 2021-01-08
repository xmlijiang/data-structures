package com.jali.demo002.sort;

import java.util.Arrays;

/**
 * 批量随机测试选择排序
 * 同一个数组同时使用其他一个排序方式排序后看是否相同
 * @author lijiang
 * @create 2021-01-08 15:15
 */
public class SelectionSort {

    /**
     * 随机生成 [1,maxSize] 长度的数组，数值范围[-maxValue,maxValue]
     * @param maxSize
     * @param maxValue
     * @return
     */
    private static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int)((maxSize)*Math.random())+1];
        for (int i = 0; i < arr.length; i++) {
            // Math.random()                    [0,1)
            // Math.random() * N                [0,N)
            // (int)(Math.random() * N)         [0,N-1]
            // (int)(Math.random() * (N+1))     [0,N]
            // [0,N] - [0,N-1]                  [0-(N-1),N-0]   [-N+1,N]
            // 假设maxValue是100，那么区间范围：[-99,100]
//            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());

            // (int)(Math.random() * (N+2)) - 1     [-1,N]
            // [-1,N] - [0,N-1] = [-1-(N-1),N] [-N,N]
            arr[i] = (int) ((maxValue + 2) * Math.random()) -1 - (int) (maxValue * Math.random());
        }
        return arr;
    }

    private static int[] copyArray(int[] arr) {
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        return copyArr;
    }

    /**
     * 打印数组
     * @param arr
     */
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }

    private static boolean isEqual(int[] arr1, int[] arr2) {
        if((arr1==null&&arr2!=null) || (arr1!=null&&arr2==null)){
            return false;
        }
        if(arr1==null&&arr2==null){
            return true;
        }
        if(arr1.length!=arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(Integer.compare(arr1[i],arr2[i])!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int testTimes = 500000;
        // 数组最大长度
        int maxSize = 100;
        // 数组中的最大数据值
        int maxValue = 100;
        // 比较成功与否
        boolean succeed = true;
        for (int i = 0; i < testTimes; i++) {
            int[] arr1 = generateRandomArray(maxSize,maxValue);
            int[] arr2 = copyArray(arr1);
//            Sort.selectionSort(arr1);
//            Sort.bubbleSort(arr1);
            Sort.insertSort(arr1);
            Arrays.sort(arr2);
            if(!isEqual(arr1,arr2)){
                succeed = false;
                printArray(arr1);
                printArray(arr2);
                break;
            }
        }
        System.out.println(succeed ? "success" : "fail");
    }

}