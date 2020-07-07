package com.fly.main;

import java.util.Arrays;

public class BubbleSort {

    private static int[] bubbleSort(int[] data){
        int length = data.length;//防止每次循环重复计算数组长度
        for (int i = 0; i < length-1; i++) {//控制冒泡次数
            for (int j = 0; j < length-i-1; j++) {//具体的数据冒泡过程
                if (data[j] > data[j+1]) {//如果相邻的两条数据，前面的比后面的大，就交换顺序。
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        return data;
    }


    public static void main(String[] args) {
        int[] data = new int[]{18,3,4,7,9,50,32,12,34,23,13};

        bubbleSort(data);

        System.out.println("最终排序结果="+ Arrays.toString(data));


    }
}
