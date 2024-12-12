package programMercarl.binaryTree;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/31 下午2:42
 */
public class q14_404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 0;
        }
        int leftValue;
        if(root.left!=null&&root.left.left==null&&root.left.right==null){
            leftValue=root.left.val;
        }else {
            leftValue=sumOfLeftLeaves(root.left);
        }
        int rightValue=sumOfLeftLeaves(root.right);
        return leftValue+rightValue;
    }
}
