package leetcode.q938;


class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }



public class Solution {
    private int sum = 0;
    private int low;
    private int high;
    public int rangeSumBST(TreeNode root, int low, int high) {
        this.low = low;
        this.high = high;

        inOrder(root);
        return sum;
    }
    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            if (root.val >= low && root.val <= high)
                sum += root.val;
             inOrder(root.right);
        }
    }
}
