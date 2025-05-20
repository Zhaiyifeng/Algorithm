package array;

/**
 * LeetCode 27. 移除元素
 * https://leetcode.cn/problems/remove-element/description/
 * 
 * 题目描述：
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。
 * 元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。
 * 
 * 要求：
 * 1. 更改 nums 数组，使 nums 的前 k 个元素包含不等于 val 的元素。
 * 2. nums 的其余元素和 nums 的大小并不重要。
 * 3. 返回 k（不等于 val 的元素数量）。
 * 
 * 示例 1：
 * 输入：nums = [3,2,2,3], val = 3
 * 输出：2, nums = [2,2,_,_]
 * 解释：函数应该返回 k = 2, 并且 nums 中的前两个元素均为 2。
 * 你在返回的 k 个元素之外留下了什么并不重要（因此它们并不计入评测）。
 * 
 * 示例 2：
 * 输入：nums = [0,1,2,2,3,0,4,2], val = 2
 * 输出：5, nums = [0,1,4,0,3,_,_,_]
 * 解释：函数应该返回 k = 5，并且 nums 中的前五个元素为 0,0,1,3,4。
 * 注意这五个元素可以任意顺序返回。
 * 你在返回的 k 个元素之外留下了什么并不重要（因此它们并不计入评测）。
 * 
 * 提示：
 * 1. 0 <= nums.length <= 100
 * 2. 0 <= nums[i] <= 50
 * 3. 0 <= val <= 100
 */
public class RemoveElement {
    
    /**
     * 移除元素算法实现
     * 时间复杂度：O(n) - 需要遍历数组一次
     * 空间复杂度：O(1) - 只使用常数级别的额外空间，原地修改数组
     * 
     * 算法思路：使用双指针技巧，一个指针 i 用于遍历数组，另一个指针 k 指向当前可以放置非目标值的位置。
     * 当遇到非目标值时，将其放到 k 指针位置，并将 k 向后移动一位。
     * 
     * @param nums 输入数组
     * @param val 要移除的值
     * @return 移除元素后数组中剩余元素的数量
     */
    public static int removeElement(int[] nums, int val) {
        /**
         * 第一次写这个题目发现我的逻辑有问题
         * 我只考虑了返回值没有考虑数组原地移除目标的因素
         * 决定使用快慢指针来解决这个问题
         * */
        if (nums == null){
            return 0;
        }
        // 慢指针，指向下一个要放置元素的位置
        int slow = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[slow] = nums[i];
                slow++;
            }
        }

        // slow指针的值就是新数组的长度
        return slow;
    }
    
    public static void main(String[] args) {
        // 测试示例1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int result1 = removeElement(nums1, val1);
        System.out.println("示例1结果: " + result1); // 应输出: 2
        System.out.print("处理后的数组前" + result1 + "个元素: ");
        for (int i = 0; i < result1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        
        // 测试示例2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int result2 = removeElement(nums2, val2);
        System.out.println("示例2结果: " + result2); // 应输出: 5
        System.out.print("处理后的数组前" + result2 + "个元素: ");
        for (int i = 0; i < result2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}
