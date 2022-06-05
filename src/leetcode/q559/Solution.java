package leetcode.q559;

// Maximum Depth of N-ary Tree


import java.util.List;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class Solution {
    private int maxDepth = 1;
    private void traverse(Node root, int depth) {
        if (root == null) {
            if (depth > maxDepth)
                maxDepth = depth;
            return;
        }

        depth++;
        System.out.println(root.val + " + " +  depth);
        for (Node child : root.children) {
            traverse(child, depth);
        }
    }

    public int maxDepth(Node root) {
        if (root == null)
            return 0;
        traverse(root, 0);
        return maxDepth;
    }
}
