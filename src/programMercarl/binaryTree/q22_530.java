package programMercarl.binaryTree;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/11/5 上午10:40
 */
public class q22_530 {
    int min=Integer.MAX_VALUE;
    TreeNode pre = new TreeNode();
    public int getMinimumDifference(TreeNode root) {
        if(root==null)return 0;
        traversal(root);
        return min;
    }

    public void traversal(TreeNode node) {
        if(node==null){
            return;
        }
        traversal(node.left);
        if(pre!=null){
            min=Math.min(Math.abs(node.val- pre.val),min);
        }
        pre=node;
        traversal(node.right);
    }
}
