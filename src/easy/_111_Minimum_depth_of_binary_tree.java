package easy;


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class _111_Minimum_depth_of_binary_tree {
    public static void main(String[] args) {

    }

    private int min = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.right == null && root.left == null){
            return 1;
        }

        int min = Integer.MAX_VALUE;
        if(root.left != null){
            min = minNumber(min,minDepth(root.left));
        }

        if(root.right != null){
            min =  minNumber(min,minDepth(root.right));
        }
        return min + 1;
    }


    public int minNumber(int a ,int b ){
        return Math.min(a, b);
    }


}


