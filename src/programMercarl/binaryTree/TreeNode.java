package programMercarl.binaryTree;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/30 下午9:32
 */
 public class TreeNode {
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