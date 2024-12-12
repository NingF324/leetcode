package programMercarl.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/31 上午10:15
 */
public class q8_226 {
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        if(root!=null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            int size =queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                TreeNode t=treeNode.left;
                treeNode.left=treeNode.right;
                treeNode.right=t;
                if(treeNode.left!=null){
                    queue.add(treeNode.left);
                }
                if(treeNode.right!=null){
                    queue.add(treeNode.right);
                }
            }
        }
        return root;
    }
}
