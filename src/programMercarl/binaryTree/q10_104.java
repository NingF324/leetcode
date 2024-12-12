package programMercarl.binaryTree;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/31 上午10:37
 */
public class q10_104 {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return Math.max(left,right)+1;
    }
}
