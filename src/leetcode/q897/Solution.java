package leetcode.q897;

// 897. Increasing Order Search Tree

//Definition for a binary tree node.
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
    private  TreeNode currentNode;

    private void inOrder(TreeNode root) {

        if (root != null) {
            inOrder(root.left);
            root.left = null;
            currentNode.right = root;
            currentNode = root;
            inOrder(root.right);
        }
    }
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        currentNode = ans;
        inOrder(root);
        return ans.right;
    }
}