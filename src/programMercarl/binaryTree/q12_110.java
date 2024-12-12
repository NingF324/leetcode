package programMercarl.binaryTree;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/31 上午11:18
 */
public class q12_110 {
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }


    public int getHeight(TreeNode node){
        if(node==null){
            return 0;
        }
        if(getHeight(node.left)==-1){
            return -1;
        }
        if(getHeight(node.right)==-1){
            return -1;
        }
        if(Math.abs(getHeight(node.left)-getHeight(node.right))>1){
            return -1;
        }
        else {
            return 1+Math.max(getHeight(node.right),getHeight(node.left));
        }
    }
}
