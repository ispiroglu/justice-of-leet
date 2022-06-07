package leetcode.q1337;

import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    private int sumOfRow(int[][] mat, int i) {
        int sum = 0;
        for (int j = 0; j < mat[i].length; j++)
            sum += mat[i][j];
        return sum;
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int idx = 0;
        int [] array = new int[k];
        for(int i = 0; i < k; i++)
            array[i]  = -1;

        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < k; j++)
            {
                if (array[j] == -1)
                    array[j] = i;
                else if (array[j] > sumOfRow(mat, i))
                    array[j] = sumOfRow(mat, i);

            }
        }
      return array;
    }
}