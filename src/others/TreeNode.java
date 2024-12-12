package others;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/9/26 上午10:57
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val=val;
    }
    TreeNode(int val,TreeNode left,TreeNode right) {
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
