package leetcode.q104;

// Maximum Depth of Binary Tree
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
      private int maxDepth = 1;
      private void traverse(TreeNode root, int depth) {
          if (root == null) {
              if (depth > maxDepth)
                  maxDepth = depth;
              return;
          }
          depth += 1;
          traverse(root.left, depth);
          traverse(root.right, depth);
      }
      public int maxDepth(TreeNode root) {
          if (root == null)
              return 0;
        traverse(root, 0);
        return maxDepth;
      }
}