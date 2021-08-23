package com.demo.test.question;

public class Solution {
    public boolean Find(int target, int [][] array) {
        int row = array.length;
        int col = array[0].length;
        if (row == 0 || col == 0)
            return false;
        if (target < array[0][0] || target > array[row - 1][col - 1])
            return false;
        int i = 0;
        int j = col - 1;
        while (i < row && j >= 0)
        {
            if (array[i][j] > target)
            {
                System.out.println(array[i][j]);
                j--;
            }
            else if (array[i][j] < target)
            {
                i++;
            }

            else
            {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [][]  array = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        boolean r = solution.Find(3, array);
        System.out.println(r);
    }
}
