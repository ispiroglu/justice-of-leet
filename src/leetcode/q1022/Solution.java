package leetcode.q1022;


// Sum of Root To Leaf Binary Numbers

  // Definition for a binary tree node.
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
class Solution {
    private int sum  = 0;

    private void postOrder(TreeNode root, String str) {
        if (root != null) {
            str += root.val;
            postOrder(root.left, str);
            postOrder(root.right, str);
            if (root.left == null && root.right == null) {
                sum += Integer.parseInt(str, 2);
            }
        }
    }

    public int sumRootToLeaf(TreeNode root) {
        if (root != null) {
            postOrder(root, "");
        }
        return sum;
    }
}
