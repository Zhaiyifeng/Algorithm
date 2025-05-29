package Recursion;

import java.util.Arrays;

/**
 * 读算法图解有感 想要手动写一下代码
 * 4.1 分而治之题目
 */
public class Recursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 0;
        int max = 0;
        //n= printArray(arr, n);
        //System.out.println(n);
        max = maxArray(arr, n, max);
        System.out.println(max);
    }
    //使用递归获取列表元素数
    public static int printArray(int[] arr, int n) {
        n++;
        //移除数组中最后一个元素
        arr = Arrays.copyOfRange(arr, 0, arr.length - 1);
        if (arr.length == 0) {
            return n;
        }
        return printArray(arr, n);
    }
    //找出列表最大值
    public static int maxArray(int[] arr, int n, int max) {
        //使用三元运算符比较arr[0]和max的大小
        max = arr[n] > max ? arr[n] : max;
        n++;
        if (n == arr.length) {
            return max;
        }
        return maxArray(arr, n, max);
    }
}
