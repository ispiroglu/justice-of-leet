package leetcode.q226;
// Invert Binary Tree



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
     private void postOrderTraverse(TreeNode root) {
         if (root == null)
             return;

         postOrderTraverse(root.left);
         postOrderTraverse(root.right);
         TreeNode temp = root.left;
         root.left = root.right;
         root.right = temp;
     }
     public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        postOrderTraverse(root);
        return root;
     }
}