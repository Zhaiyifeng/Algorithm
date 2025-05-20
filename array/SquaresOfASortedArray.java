package array;

import java.util.Arrays;

public class SquaresOfASortedArray {

    /**
     * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
     *
     * @param nums 非递减顺序排序的整数数组
     * @return 每个数字平方后的新数组，按非递减顺序排序
     */
    public int[] sortedSquares(int[] nums) {

        int left = 0; // 初始化左指针，指向数组的起始位置
        int right = nums.length - 1; // 初始化右指针，指向数组的末尾位置
        int index = nums.length - 1; // 初始化结果数组的索引，从末尾开始填充
        // 创建一个和输入数组相同长度的数组，用于存储结果
        int[] result = new int[nums.length];
        while (left <= right) { // 当左指针不超过右指针时，继续循环
            int l = nums[left] * nums[left]; // 计算左指针元素的平方
            int r = nums[right] * nums[right]; // 计算右指针元素的平方

            if (l <= r) { // 如果左边的平方小于或等于右边的平方
                result[index] = r; // 将右边的平方放入结果数组的当前位置
                right--; // 右指针左移
            } else {
                result[index] = l; // 否则将左边的平方放入结果数组的当前位置
                left++; // 左指针右移
            }
            index--; // 结果数组的索引前移

        }
        return result; // 返回结果数组
    }


    public static void main(String[] args) {
        SquaresOfASortedArray solution = new SquaresOfASortedArray();

        // 示例
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = solution.sortedSquares(nums);

        System.out.println("输入数组: " + Arrays.toString(nums));
        System.out.println("输出数组: " + Arrays.toString(result));
    }
}
