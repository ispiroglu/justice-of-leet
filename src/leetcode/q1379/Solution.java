package leetcode.q1379;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution {
    private TreeNode ans, target;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target = target;
        inOrder(original, cloned);
        return ans;
    }
    public final void inOrder(final TreeNode o, final TreeNode c) {
        if (o != null) {
            inOrder(o.left, c.left);
            if (o == target)
                ans = c;
            inOrder(o.right, c.right);
        }
    }
}
