package array;

/**
 * LeetCode 59. 螺旋矩阵 II
 * https://leetcode.cn/problems/spiral-matrix-ii/description/
 * 
 * 题目描述：
 * 给你一个正整数 n ，生成一个包含 1 到 n^2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 * 
 * 示例 1:
 * 输入: n = 3
 * 输出: [[1,2,3],[8,9,4],[7,6,5]]
 * 
 * 示例 2:
 * 输入: n = 1
 * 输出: [[1]]
 * 
 * 提示：
 * 1 <= n <= 20
 */
public class SpiralMatrixII {
    
    /**
     * 生成螺旋矩阵
     * 时间复杂度：O(n^2) - 需要填充n^2个元素
     * 空间复杂度：O(n^2) - 需要存储n^2个元素的矩阵
     * 
     * @param n 矩阵的维度
     * @return 生成的螺旋矩阵
     */
    public static int[][] generateMatrix(int n) {
      //二刷螺旋矩阵真麻了
        //首先定义一个二维数组用来存放矩阵
        int[][] matrix = new int[n][n];
        int num = 1;
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        while(left <= right && top <= bottom){
            for (int i = left; i <=right ; i++) {
                matrix[top][i] = num++;
            }
            top++;
            for(int i = top; i <= bottom; i++){
                matrix[i][right] = num++;
            }
            right--;
            for(int i = right; i >= left; i--){
                matrix[bottom][i] = num++;
            }
            bottom--;
            for(int i = bottom; i >= top; i--){
                matrix[i][left] = num++;
            }
            left++;
        }
        return matrix;
    }
    
    public static void main(String[] args) {
        // 测试用例
        //int[] testCases = {1, 3, 4};
        int[] testCases = {10};

        for (int n : testCases) {
            System.out.println("n = " + n + ":");
            int[][] matrix = generateMatrix(n);
            
            // 打印矩阵
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}