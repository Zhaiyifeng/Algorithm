package array;

/**
 * LeetCode 704. 二分查找
 * https://leetcode.cn/problems/binary-search/description/
 * 
 * 题目描述：
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * 
 * 示例 1:
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 * 
 * 示例 2:
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 * 
 * 提示：
 * 1. 你可以假设 nums 中的所有元素是不重复的。
 * 2. n 将在 [1, 10000]之间。
 * 3. nums 的每个元素都将在 [-9999, 9999]之间。
 */
public class BinarySearch {
    
    /**
     * 二分查找算法实现
     * 时间复杂度：O(log n) - 每次查找范围缩小一半
     * 空间复杂度：O(1) - 只使用常数级别的额外空间
     * 
     * @param nums 有序数组（升序）
     * @param target 目标值
     * @return 如果找到目标值，返回其索引，否则返回-1
     */
    public static int search(int[] nums, int target) {
        //右指针
        int right = nums.length - 1;
        //循环中的i天生为左指针
        for (int i = 0; i < nums.length; i++) {
            if (nums[right] == target ||nums[i] == target){
                return nums[right] == target ? right : i;
            }else {
                right--;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // 测试示例1
        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        int target1 = 9;
        System.out.println("示例1结果: " + search(nums1, target1)); // 应输出: 4

        // 测试示例2
        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        int target2 = 2;
        System.out.println("示例2结果: " + search(nums2, target2)); // 应输出: -1
    }
}
