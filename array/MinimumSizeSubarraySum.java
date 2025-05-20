package array;

public class MinimumSizeSubarraySum {

    /**
     * 找出数组中满足其总和大于等于 target 的长度最小的子数组，并返回其长度。
     * 如果不存在符合条件的子数组，返回 0。
     * <p>
     * 算法思路：使用滑动窗口技巧，动态调整窗口的大小以找到满足条件的最小子数组。
     *
     * @param target 目标和
     * @param nums   输入数组
     * @return 满足条件的子数组的最小长度
     */
    public int minSubArrayLen(int target, int[] nums) {


        // 初始化滑动窗口的左右指针和当前窗口的和，以及最小子数组的长度
        int left = 0; // 左指针初始化为0
        int right = 0; // 右指针初始化为0
        int sum = 0; // 当前窗口的和初始化为0
        int minLen = Integer.MAX_VALUE; // 最小子数组长度初始化为最大整数值
        sum += nums[right]; // 将第一个元素加入当前窗口的和
        // 右指针只要小于数组长度就可以一直执行
        while (right < nums.length) {
            // 首先先处理第一个逻辑当不满足时一直+
            while (sum < target) {
                right++; // 右指针向右移动
                if (right == nums.length){
                    return minLen == Integer.MAX_VALUE ? 0 : minLen; // 如果右指针到达数组末尾，返回结果
                }
                sum  += nums[right]; // 将当前右指针指向的元素加入窗口的和
            }

            while (sum >= target) {
                while (sum >= target){
                    if (right - left + 1 < minLen) {
                        minLen = right - left + 1; // 更新最小子数组长度
                    }
                    sum -= nums[left]; // 从窗口的和中减去左指针指向的元素
                    left++; // 左指针向右移动
                }

            }

        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen; // 返回结果  return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();

        // 示例1
        int target1 = 7;
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        System.out.println("示例1结果: " + solution.minSubArrayLen(target1, nums1)); // 应输出: 2

        // 示例2
        int target2 = 4;
        int[] nums2 = {1, 4, 4};
        System.out.println("示例2结果: " + solution.minSubArrayLen(target2, nums2)); // 应输出: 1

        // 示例3
        int target3 = 11;
        int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println("示例3结果: " + solution.minSubArrayLen(target3, nums3)); // 应输出: 0

         //示例4
        int target4 = 213;
        int[] nums4 = {12,28,83,4,25,26,25,2,25,25,25,12};//预期结果8
        System.out.println("示例4结果: " + solution.minSubArrayLen(target4, nums4)); // 示例4
        // 示例5
        int target5 = 7;
        int[] nums5 = {8};//预期结果1
        System.out.println("示例4结果: " + solution.minSubArrayLen(target5, nums5));
    }
}