package programMercarl.binaryTree;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/31 下午3:20
 */
public class q16_112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root!=null){
            return traversal(root,targetSum);
        }
        return false;
    }

    public boolean traversal(TreeNode node,int count){
        count-=node.val;
        if(node.left==null&&node.right==null&&count==0){
            return true;
        }
        if(node.left==null&&node.right==null){
            return false;
        }
        if(node.left!=null){

        }
        if(node.right!=null){

        }
        if (node.left!=null) { // 左
            count -= node.left.val; // 递归，处理节点;
            if (traversal(node.left, count)) return true;
            count += node.left.val; // 回溯，撤销处理结果
        }
        if (node.right!=null) { // 右
            count -= node.right.val; // 递归，处理节点;
            if (traversal(node.right, count)) return true;
            count += node.right.val; // 回溯，撤销处理结果
        }
        return false;
    }
}
