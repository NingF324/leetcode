package programMercarl.binaryTree;

import java.util.*;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/30 下午10:15
 */
public class q6_515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root!=null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            int size =queue.size();
            int max=Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode treeNode=queue.poll();
                max= Math.max(treeNode.val, max);
                if(treeNode.left!=null){
                    queue.add(treeNode.left);
                }
                if(treeNode.right!=null){
                    queue.add(treeNode.right);
                }
            }
            list.add(max);
        }
        return list;
    }
}
