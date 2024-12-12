package programMercarl.binaryTree;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/31 上午10:25
 */
public class q9_101 {
    public boolean isSymmetric(TreeNode root) {
        return compare(root.left,root.right);
    }
    public boolean compare(TreeNode left,TreeNode right){
        if (left==null&&right==null){
            return true;
        } else if (left == null && right != null) {
            return false;
        } else if (left != null && right == null) {
            return false;
        } else if (left.val != right.val) {
            return false;
        }
        boolean outside = compare(left.left,right.right);
        boolean inside = compare(left.right,right.left);
        return outside&inside;
    }
}
